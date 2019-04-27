package org.rcsb.cif.model.pdbxexptlcrystalcryotreatment;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CrystalId extends SingleRowStrColumn {
    public CrystalId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CrystalId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CrystalId(String name) {
        super(name);
    }
}
