package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of fiducial markers.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmFiducialMarkers extends DelegatingCategory {
    public EmFiducialMarkers(Category delegate) {
        super(delegate);
    }

    /**
     * Diameter of the fiducial markers
     * @return FloatColumn
     */
    public FloatColumn getDiameter() {
        return delegate.getColumn("diameter", DelegatingFloatColumn::new);
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getEmTomographySpecimenId() {
        return delegate.getColumn("em_tomography_specimen_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the primary key of the category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Manufacturer source for the fiducial markers
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return delegate.getColumn("manufacturer", DelegatingStrColumn::new);
    }
}
