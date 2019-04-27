package org.rcsb.cif.model.pdbxdepositionmessageinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ParentMessageId extends StrColumn {
    public ParentMessageId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ParentMessageId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ParentMessageId(String name) {
        super(name);
    }
}
