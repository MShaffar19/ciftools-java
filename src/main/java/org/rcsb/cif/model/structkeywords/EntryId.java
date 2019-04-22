package org.rcsb.cif.model.structkeywords;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class EntryId extends StrColumn {
    public EntryId(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public EntryId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EntryId(String name) {
        super(name);
    }
}