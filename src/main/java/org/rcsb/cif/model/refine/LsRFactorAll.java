package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LsRFactorAll extends SingleRowFloatColumn {
    public LsRFactorAll(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LsRFactorAll(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LsRFactorAll(String name) {
        super(name);
    }
}
