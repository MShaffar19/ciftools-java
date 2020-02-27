package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Data items in the PDBX_DATABASE_REMARK category record keep additional
 * information about the entry.  They are mostly used to create
 * 'non-standard' PDB REMARK annotations (6-99).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseRemark extends DelegatingCategory {
    public PdbxDatabaseRemark(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the PDB remark record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The full text of the PDB remark record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }
}
