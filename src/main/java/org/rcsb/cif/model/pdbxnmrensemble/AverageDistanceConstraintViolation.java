package org.rcsb.cif.model.pdbxnmrensemble;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AverageDistanceConstraintViolation extends FloatColumn {
    public AverageDistanceConstraintViolation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AverageDistanceConstraintViolation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AverageDistanceConstraintViolation(String name) {
        super(name);
    }
}
