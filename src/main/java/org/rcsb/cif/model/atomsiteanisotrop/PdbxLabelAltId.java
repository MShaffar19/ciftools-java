package org.rcsb.cif.model.atomsiteanisotrop;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxLabelAltId extends StrColumn {
    public PdbxLabelAltId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxLabelAltId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxLabelAltId(String name) {
        super(name);
    }
}
