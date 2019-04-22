package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class TypeSymbol extends StrColumn {
    public TypeSymbol(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public TypeSymbol(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TypeSymbol(String name) {
        super(name);
    }
}