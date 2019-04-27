package org.rcsb.cif.model.phasingmadset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FPrime extends FloatColumn {
    public FPrime(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FPrime(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FPrime(String name) {
        super(name);
    }
}
