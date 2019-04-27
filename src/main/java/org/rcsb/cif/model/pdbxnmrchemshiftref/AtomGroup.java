package org.rcsb.cif.model.pdbxnmrchemshiftref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomGroup extends StrColumn {
    public AtomGroup(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AtomGroup(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AtomGroup(String name) {
        super(name);
    }
}
