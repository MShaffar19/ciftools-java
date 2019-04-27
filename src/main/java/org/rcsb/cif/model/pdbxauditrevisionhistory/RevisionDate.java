package org.rcsb.cif.model.pdbxauditrevisionhistory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RevisionDate extends StrColumn {
    public RevisionDate(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RevisionDate(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RevisionDate(String name) {
        super(name);
    }
}
