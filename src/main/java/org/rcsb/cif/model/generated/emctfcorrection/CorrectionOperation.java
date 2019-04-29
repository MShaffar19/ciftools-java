package org.rcsb.cif.model.generated.emctfcorrection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CorrectionOperation extends SingleRowStrColumn {
    public CorrectionOperation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CorrectionOperation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CorrectionOperation(String name) {
        super(name);
    }
}