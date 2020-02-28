package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the AUDIT_CONFORM category describe the
 * dictionary versions against which the data names appearing in
 * the current data block are conformant.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditConform extends DelegatingCategory {
    public AuditConform(Category delegate) {
        super(delegate);
    }

    /**
     * A file name or uniform resource locator (URL) for the
     * dictionary to which the current data block conforms.
     * @return StrColumn
     */
    public StrColumn getDictLocation() {
        return delegate.getColumn("dict_location", DelegatingStrColumn::new);
    }

    /**
     * The string identifying the highest-level dictionary defining
     * data names used in this file.
     * @return StrColumn
     */
    public StrColumn getDictName() {
        return delegate.getColumn("dict_name", DelegatingStrColumn::new);
    }

    /**
     * The version number of the dictionary to which the current
     * data block conforms.
     * @return StrColumn
     */
    public StrColumn getDictVersion() {
        return delegate.getColumn("dict_version", DelegatingStrColumn::new);
    }
}