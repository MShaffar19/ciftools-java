package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedData;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.IntervalQuantizationEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * A library of codec implementations and provider to codec-specific constants such as encoder name, version, and
 * minimal version of the data to decode.
 */
public class BinaryCifCodec {
    public static final String CODEC_NAME = "ciftools-java";
    public static final String VERSION = "0.3.0";
    public static final String MIN_VERSION = "0.3";
    public static final MessagePackCodec MESSAGE_PACK_CODEC = new MessagePackCodec();

    /**
     * Decode an instance of {@link EncodedData} by traversing its encoding chain until the original data is restored.
     * @param encodedData the data to decode
     * @return the decoded data
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static EncodedData<?> decode(EncodedData<?> encodedData) {
        EncodedData<?> current = encodedData;

        while (current.hasNextDecodingStep()) {
            // pop the last element of this encoding chain, do so until chain is completely resolved
            Encoding encoding = current.getEncoding().removeLast();
            current = encoding.decode(current);
        }

        return current;
    }

    /**
     * Decode an instance of {@link EncodedData} by traversing its encoding chain until the original data is restored.
     * @param encodedData the map of data to decode
     * @return the decoded data
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static Object decode(Map<String, Object> encodedData) {
        EncodedData current = new ByteArray((byte[]) encodedData.get("data"));
        Object[] encodingMaps = (Object[]) encodedData.get("encoding");
        for (int i = encodingMaps.length - 1; i >= 0; i--) {
            Map<String, Object> map = (Map<String, Object>) encodingMaps[i];
            Encoding encoding = deserializeEncodingMap(map);
            current = encoding.decode(current);
        }

        return current.getData();
    }

    /**
     * Convert a map representation of an encoding to a Java object.
     * @param encoding map representation of encoding
     * @return the concrete Encoding instance
     */
    private static Encoding<?, ?> deserializeEncodingMap(Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
        int srcType, srcSize;
        switch (kind) {
            case "ByteArray":
                int type = (int) encoding.get("type");
                return new ByteArrayEncoding(type);
            case "FixedPoint":
                int factor = (int) encoding.get("factor");
                srcType = (int) encoding.get("srcType");
                return new FixedPointEncoding(factor, srcType);
            case "IntervalQuantization":
                int min = (int) encoding.get("min");
                int max = (int) encoding.get("max");
                int numSteps = (int) encoding.get("numSteps");
                srcType = (int) encoding.get("srcType");
                return new IntervalQuantizationEncoding(min, max, numSteps, srcType);
            case "RunLength":
                srcType = (int) encoding.get("srcType");
                srcSize = (int) encoding.get("srcSize");
                return new RunLengthEncoding(srcType, srcSize);
            case "Delta":
                int origin = (int) encoding.get("origin");
                srcType = (int) encoding.get("srcType");
                return new DeltaEncoding(origin, srcType);
            case "IntegerPacking":
                 int byteCount = (int) encoding.get("byteCount");
                 boolean isUnsigned = (boolean) encoding.get("isUnsigned");
                 srcSize = (int) encoding.get("srcSize");
                return new IntegerPackingEncoding(byteCount, isUnsigned, srcSize);
            case "StringArray":
                Deque<Encoding<?, ?>> outputEncoding = deserializeEncodingMap(encoding.get("dataEncoding"));
                Deque<Encoding<?, ?>> offsetEncoding = deserializeEncodingMap(encoding.get("offsetEncoding"));
                return new StringArrayEncoding(encoding, outputEncoding, offsetEncoding);
            default:
                throw new IllegalArgumentException("Unsupported Encoding kind: " + kind);
        }
    }

    @SuppressWarnings("unchecked")
    private static Deque<Encoding<?, ?>> deserializeEncodingMap(Object rawEncodingMap) {
        Object[] encodingMap = (Object[]) rawEncodingMap;
        Deque<Encoding<?, ?>> encodings = new ArrayDeque<>();
        for (Object o : encodingMap) {
            encodings.add(deserializeEncodingMap((Map<String, Object>) o));
        }
        return encodings;
    }
}
