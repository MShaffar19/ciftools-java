package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_FUNCT_MINIMIZED category record
 * details about the individual terms of the function minimized
 * during refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineFunctMinimized extends DelegatingCategory {
    public RefineFunctMinimized(Category delegate) {
        super(delegate);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_funct_minimized.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * The number of observations in this term.  For example, if the
     * term is a residual of the X-ray intensities, this item would
     * contain the number of reflections used in the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberTerms() {
        return delegate.getColumn("number_terms", DelegatingIntColumn::new);
    }

    /**
     * The residual for this term of the function that was minimized
     * during the refinement.
     * @return FloatColumn
     */
    public FloatColumn getResidual() {
        return delegate.getColumn("residual", DelegatingFloatColumn::new);
    }

    /**
     * The type of the function being minimized.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The weight applied to this term of the function that was
     * minimized during the refinement.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return delegate.getColumn("weight", DelegatingFloatColumn::new);
    }
}
