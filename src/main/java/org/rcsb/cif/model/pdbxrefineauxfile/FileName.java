package org.rcsb.cif.model.pdbxrefineauxfile;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FileName extends SingleRowStrColumn {
    public FileName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FileName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FileName(String name) {
        super(name);
    }
}
