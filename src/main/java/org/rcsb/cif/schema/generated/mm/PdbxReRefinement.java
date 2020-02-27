package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Describes the origin of the experimental data used in this
 * entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReRefinement extends DelegatingCategory {
    public PdbxReRefinement(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier for entry where the experimental data was obtained.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A pointer to _citation.id in category CITATION describing the
     * the citation of the entry from from which the experimental data
     * was obtained.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details about this re-refinement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
