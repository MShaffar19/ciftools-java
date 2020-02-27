package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_RESIDUES_NOT_MODELED category record the
 * details of the residues that are defined in the
 * IHM_STRUCT_ASSEMBLY category but are missing in the
 * three-dimensional model (ATOM_SITE, IHM_SPHERE_OBJ_SITE,
 * IHM_GAUSSIAN_OBJ_SITE categories) i.e., residues in the
 * assembly that are not modeled.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmResiduesNotModeled extends DelegatingCategory {
    public IhmResiduesNotModeled(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural model.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * A text description of the molecular entity, whose residues are not modeled.
     * This data item is a pointer to _entity.pdbx_description in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return delegate.getColumn("entity_description", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier to the molecular entity, whose residues are not modeled.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The starting residue index for the sequence segment of missing residues.
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The ending residue index for the sequence segment of missing residues.
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The reason why the residues are missing in the structural model.
     * @return StrColumn
     */
    public StrColumn getReason() {
        return delegate.getColumn("reason", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the missing segments.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
