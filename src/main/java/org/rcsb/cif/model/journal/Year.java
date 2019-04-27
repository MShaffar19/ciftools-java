package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Year extends SingleRowStrColumn {
    public Year(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Year(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Year(String name) {
        super(name);
    }
}
