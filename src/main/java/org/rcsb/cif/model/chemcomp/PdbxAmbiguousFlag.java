package org.rcsb.cif.model.chemcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAmbiguousFlag extends StrColumn {
    public PdbxAmbiguousFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxAmbiguousFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxAmbiguousFlag(String name) {
        super(name);
    }
}
