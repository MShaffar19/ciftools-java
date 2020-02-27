package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_chem_comp_subcomponent_struct_conn
 * list the chemical interactions among the subcomponents in
 * the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompSubcomponentStructConn extends DelegatingCategory {
    public PdbxChemCompSubcomponentStructConn(Category delegate) {
        super(delegate);
    }

    /**
     * Ordinal index for the interactions listed in this category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier for the second atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingIntColumn::new);
    }

    /**
     * The atom identifier for the first atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier for the second atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }
}
