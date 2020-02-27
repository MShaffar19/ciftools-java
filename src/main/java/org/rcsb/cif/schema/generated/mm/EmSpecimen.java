package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EMD_SPECIMEN category record details
 * about specimens prepared for imaging by electron microscopy.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSpecimen extends DelegatingCategory {
    public EmSpecimen(Category delegate) {
        super(delegate);
    }

    /**
     * The concentration (in milligrams per milliliter, mg/ml)
     * of the complex in the sample.
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return delegate.getColumn("concentration", DelegatingFloatColumn::new);
    }

    /**
     * A description of any additional details of the specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that the specimen has been embedded.
     * @return StrColumn
     */
    public StrColumn getEmbeddingApplied() {
        return delegate.getColumn("embedding_applied", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _em_experiment.id.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * The item  _em_specimen.id uniquely identifies a specimen along with
     * its preparation methods.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that the specimen has been shadowed.
     * @return StrColumn
     */
    public StrColumn getShadowingApplied() {
        return delegate.getColumn("shadowing_applied", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that the specimen has been stained.
     * @return StrColumn
     */
    public StrColumn getStainingApplied() {
        return delegate.getColumn("staining_applied", DelegatingStrColumn::new);
    }

    /**
     * 'YES' indicates that the specimen was vitrified by cryopreservation.
     * @return StrColumn
     */
    public StrColumn getVitrificationApplied() {
        return delegate.getColumn("vitrification_applied", DelegatingStrColumn::new);
    }
}
