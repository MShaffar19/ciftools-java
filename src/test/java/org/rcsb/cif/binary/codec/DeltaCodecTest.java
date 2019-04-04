package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.Int8Array;
import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.array.NumberArray;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.rcsb.cif.binary.codec.DeltaCodec.DELTA_CODEC;

public class DeltaCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int8Array plainArray = new Int8Array(1, 2, 3, 4, 5, 6);
        CodecData<Int8Array> plainData = CodecData.of(plainArray).create(DeltaCodec.KIND);

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getArray()));

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getArray(), (int[]) decodedArray.getArray());
    }

    @Test
    public void honorSrcType() {
        // create test case
        Int8Array plainArray = new Int8Array(1, 2, 3, 4, 5, 6);
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .addParameter("srcType", 1)
                .create(DeltaCodec.KIND);

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertTrue(encodedData.getData() instanceof Int8Array);

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertTrue(decodedArray instanceof Int8Array);
    }

    @Test
    public void fallbackToInt32Array() {
        // create test case
        Int8Array plainArray = new Int8Array(1, 2, 3, 4, 5, 6);
        CodecData<Int8Array> plainData = CodecData.of(plainArray).create(DeltaCodec.KIND);

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertTrue(encodedData.getData() instanceof Int32Array);

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertTrue(decodedArray instanceof Int32Array);
    }

    @Test
    public void emptyCase() {
        Int8Array plainArray = new Int8Array();
        CodecData<Int8Array> plainData = CodecData.of(plainArray).create(DeltaCodec.KIND);

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertEquals(0, encodedData.getData().getArray().length);

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertEquals(0, ((int[]) decodedArray.getArray()).length);
    }
}