package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Buffer category
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmBufferComponent extends DelegatingCategory {
    public EmBufferComponent(Category delegate) {
        super(delegate);
    }

    /**
     * Foreign key to the entry category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return delegate.getColumn("buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The concentration of the sample (arbitrary units).
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return delegate.getColumn("concentration", DelegatingFloatColumn::new);
    }

    /**
     * Units for the sample concentration value.
     * @return StrColumn
     */
    public StrColumn getConcentrationUnits() {
        return delegate.getColumn("concentration_units", DelegatingStrColumn::new);
    }

    /**
     * formula for buffer component
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * This data item is the primary key of the category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * name of the buffer component
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }
}