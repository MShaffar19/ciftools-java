package org.rcsb.cif.model.phasingmad;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReflnsCentric extends SingleRowIntColumn {
    public PdbxReflnsCentric(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxReflnsCentric(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxReflnsCentric(String name) {
        super(name);
    }
}
