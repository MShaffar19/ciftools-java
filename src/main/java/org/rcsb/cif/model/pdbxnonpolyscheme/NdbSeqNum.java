package org.rcsb.cif.model.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class NdbSeqNum extends StrColumn {
    public NdbSeqNum(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public NdbSeqNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NdbSeqNum(String name) {
        super(name);
    }
}