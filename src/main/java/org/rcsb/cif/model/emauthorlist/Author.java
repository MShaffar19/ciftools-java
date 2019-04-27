package org.rcsb.cif.model.emauthorlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Author extends StrColumn {
    public Author(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Author(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Author(String name) {
        super(name);
    }
}
