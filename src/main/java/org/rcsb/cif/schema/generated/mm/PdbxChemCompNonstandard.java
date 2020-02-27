package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
 * common nucleotide modifications and nonstandard features.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompNonstandard extends DelegatingCategory {
    public PdbxChemCompNonstandard(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item describes modification  type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }
}
