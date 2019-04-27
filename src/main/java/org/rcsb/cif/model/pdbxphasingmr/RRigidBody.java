package org.rcsb.cif.model.pdbxphasingmr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RRigidBody extends SingleRowFloatColumn {
    public RRigidBody(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RRigidBody(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RRigidBody(String name) {
        super(name);
    }
}
