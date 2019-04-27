package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxCrystalImageUrl extends SingleRowStrColumn {
    public PdbxCrystalImageUrl(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxCrystalImageUrl(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxCrystalImageUrl(String name) {
        super(name);
    }
}
