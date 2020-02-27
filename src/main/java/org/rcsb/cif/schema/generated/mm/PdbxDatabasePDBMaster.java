package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_DATABASE_PDB_MASTER category provides placeholders
 * for the count of various PDB record types.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabasePDBMaster extends DelegatingCategory {
    public PdbxDatabasePDBMaster(Category delegate) {
        super(delegate);
    }

    /**
     * A link to _ENTRY.id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumRemark() {
        return delegate.getColumn("num_remark", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumFtnote() {
        return delegate.getColumn("num_ftnote", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumHet() {
        return delegate.getColumn("num_het", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumHelix() {
        return delegate.getColumn("num_helix", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSheet() {
        return delegate.getColumn("num_sheet", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTurn() {
        return delegate.getColumn("num_turn", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSite() {
        return delegate.getColumn("num_site", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTrans() {
        return delegate.getColumn("num_trans", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumCoord() {
        return delegate.getColumn("num_coord", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTer() {
        return delegate.getColumn("num_ter", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumConect() {
        return delegate.getColumn("num_conect", DelegatingIntColumn::new);
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSeqres() {
        return delegate.getColumn("num_seqres", DelegatingIntColumn::new);
    }
}
