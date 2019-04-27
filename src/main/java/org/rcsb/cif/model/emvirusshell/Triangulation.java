package org.rcsb.cif.model.emvirusshell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Triangulation extends IntColumn {
    public Triangulation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Triangulation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Triangulation(String name) {
        super(name);
    }
}
