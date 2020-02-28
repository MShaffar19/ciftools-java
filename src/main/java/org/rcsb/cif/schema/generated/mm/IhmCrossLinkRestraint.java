package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CROSS_LINK_RESTRAINT category enumerates the
 * implementation details of the chemical crosslinking restraints in
 * the integrative modeling. This category holds the details of how
 * the experimentally derived crosslinks are applied in the modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmCrossLinkRestraint extends DelegatingCategory {
    public IhmCrossLinkRestraint(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the cross link record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for a set of ambiguous cross-links.
     * Handles implementation uncertainties related to multiple copies of subunit.
     * This data item is a pointer to _ihm_cross_link_list.id in the
     * IHM_CROSS_LINK_LIST category.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier for the first monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.entity_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.entity_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the first monomer partner in the cross-link.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return delegate.getColumn("asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the second monomer partner in the cross-link.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return delegate.getColumn("asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.comp_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.comp_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.seq_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.seq_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The atom identifier for the first monomer partner in the cross link.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier for the second monomer partner in the cross link.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The type of the cross link restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The cross link conditionality.
     * @return StrColumn
     */
    public StrColumn getConditionalCrosslinkFlag() {
        return delegate.getColumn("conditional_crosslink_flag", DelegatingStrColumn::new);
    }

    /**
     * The coarse-graining information for the crosslink implementation.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return delegate.getColumn("model_granularity", DelegatingStrColumn::new);
    }

    /**
     * The distance threshold applied to this crosslink in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThreshold() {
        return delegate.getColumn("distance_threshold", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the crosslinking experimental data;
     * may be approximated to the false positive rate.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return delegate.getColumn("psi", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the position of residue 1 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma1() {
        return delegate.getColumn("sigma_1", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the position of residue 2 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma2() {
        return delegate.getColumn("sigma_2", DelegatingFloatColumn::new);
    }
}