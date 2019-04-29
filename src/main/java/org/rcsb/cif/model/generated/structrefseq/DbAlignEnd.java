package org.rcsb.cif.model.generated.structrefseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DbAlignEnd extends SingleRowIntColumn {
    public DbAlignEnd(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DbAlignEnd(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DbAlignEnd(String name) {
        super(name);
    }
}