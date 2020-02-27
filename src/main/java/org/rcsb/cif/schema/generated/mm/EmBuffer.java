package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the BUFFER category
 * record details of the sample buffer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmBuffer extends DelegatingCategory {
    public EmBuffer(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _em_buffer.id must
     * uniquely identify the sample buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * pointer to  _em_specimen.id
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the buffer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the buffer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the buffer.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return delegate.getColumn("pH", DelegatingFloatColumn::new);
    }
}
