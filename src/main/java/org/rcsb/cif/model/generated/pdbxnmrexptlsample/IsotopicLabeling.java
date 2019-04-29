package org.rcsb.cif.model.generated.pdbxnmrexptlsample;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IsotopicLabeling extends StrColumn {
    public IsotopicLabeling(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IsotopicLabeling(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IsotopicLabeling(String name) {
        super(name);
    }
}