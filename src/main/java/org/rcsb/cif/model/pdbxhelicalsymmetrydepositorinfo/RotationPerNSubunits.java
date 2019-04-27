package org.rcsb.cif.model.pdbxhelicalsymmetrydepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RotationPerNSubunits extends SingleRowFloatColumn {
    public RotationPerNSubunits(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RotationPerNSubunits(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RotationPerNSubunits(String name) {
        super(name);
    }
}
