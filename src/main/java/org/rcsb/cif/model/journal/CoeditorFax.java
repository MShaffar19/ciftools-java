package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CoeditorFax extends SingleRowStrColumn {
    public CoeditorFax(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CoeditorFax(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CoeditorFax(String name) {
        super(name);
    }
}
