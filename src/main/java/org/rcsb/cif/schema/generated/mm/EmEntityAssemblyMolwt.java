package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record details about the molecular weight of
 * an assembly component of the sample.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmEntityAssemblyMolwt extends DelegatingCategory {
    public EmEntityAssemblyMolwt(Category delegate) {
        super(delegate);
    }

    /**
     * A reference to  _em_entity_assembly.id which uniquely identifies
     * one assembly or assembly component of the imaged sample.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Identifies whether the given molecular weight was derived experimentally.
     * @return StrColumn
     */
    public StrColumn getExperimentalFlag() {
        return delegate.getColumn("experimental_flag", DelegatingStrColumn::new);
    }

    /**
     * Ordinal key for the em_entity_assembly_molwt category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Molecular weight units.
     * @return StrColumn
     */
    public StrColumn getUnits() {
        return delegate.getColumn("units", DelegatingStrColumn::new);
    }

    /**
     * The molecular weight of the assembly component.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * The method used to determine the molecular weight.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }
}
