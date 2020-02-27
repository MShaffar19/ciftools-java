package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
 * characteristics of protein oligonucleotide binding in which
 * the binding mode is enzymatic.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityFuncEnzyme extends DelegatingCategory {
    public PdbxEntityFuncEnzyme(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is pointer to _pdbx_entity_func_bind_mode.id in the
     * PDBX_ENTITY_FUNC_BIND_MODE category.
     * @return StrColumn
     */
    public StrColumn getBindModeId() {
        return delegate.getColumn("bind_mode_id", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the type of enzyme function.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }
}
