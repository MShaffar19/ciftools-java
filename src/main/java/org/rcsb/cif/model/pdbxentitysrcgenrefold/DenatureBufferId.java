package org.rcsb.cif.model.pdbxentitysrcgenrefold;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DenatureBufferId extends StrColumn {
    public DenatureBufferId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DenatureBufferId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DenatureBufferId(String name) {
        super(name);
    }
}
