package org.rcsb.cif.model.structrefseqdif;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPdbStrandId extends SingleRowStrColumn {
    public PdbxPdbStrandId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxPdbStrandId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxPdbStrandId(String name) {
        super(name);
    }
}
