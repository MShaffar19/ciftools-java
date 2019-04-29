package org.rcsb.cif.model.generated.pdbxdataprocessingreflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PercentRejected extends FloatColumn {
    public PercentRejected(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PercentRejected(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PercentRejected(String name) {
        super(name);
    }
}