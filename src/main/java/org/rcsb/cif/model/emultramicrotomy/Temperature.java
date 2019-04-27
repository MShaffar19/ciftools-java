package org.rcsb.cif.model.emultramicrotomy;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Temperature extends IntColumn {
    public Temperature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Temperature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Temperature(String name) {
        super(name);
    }
}
