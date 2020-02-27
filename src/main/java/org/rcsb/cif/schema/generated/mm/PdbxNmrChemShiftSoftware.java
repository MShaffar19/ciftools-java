package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Items in the chem_shift_software category provide pointers to the software category and methods category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrChemShiftSoftware extends DelegatingCategory {
    public PdbxNmrChemShiftSoftware(Category delegate) {
        super(delegate);
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.id'
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return delegate.getColumn("assigned_chem_shift_list_id", DelegatingIntColumn::new);
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_software.ordinal'
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

    /**
     * 
     * Name given to the software. The name should match the name provided when the software was described in the software category.
     * @return StrColumn
     */
    public StrColumn getSoftwareLabel() {
        return delegate.getColumn("software_label", DelegatingStrColumn::new);
    }
}
