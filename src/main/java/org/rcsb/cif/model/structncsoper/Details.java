package org.rcsb.cif.model.structncsoper;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Details extends SingleRowStrColumn {
    public Details(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Details(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Details(String name) {
        super(name);
    }
}