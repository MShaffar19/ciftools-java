package org.rcsb.cif.model.structmonnucl;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Delta extends FloatColumn {
    public Delta(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Delta(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Delta(String name) {
        super(name);
    }
}
