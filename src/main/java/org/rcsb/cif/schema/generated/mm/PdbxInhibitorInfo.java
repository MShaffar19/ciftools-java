package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_INHIBITOR_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * inhibitor is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxInhibitorInfo extends DelegatingCategory {
    public PdbxInhibitorInfo(Category delegate) {
        super(delegate);
    }

    /**
     * Serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Name of inhibitor.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Number of inhibitor molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return delegate.getColumn("num_per_asym_unit", DelegatingIntColumn::new);
    }
}
