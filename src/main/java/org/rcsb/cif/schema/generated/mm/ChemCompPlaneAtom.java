package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
 * atoms in a plane within a chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompPlaneAtom extends DelegatingCategory {
    public ChemCompPlaneAtom(Category delegate) {
        super(delegate);
    }

    /**
     * The ID of an atom involved in the plane.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp_plane.id in the
     * CHEM_COMP_PLANE category.
     * @return StrColumn
     */
    public StrColumn getPlaneId() {
        return delegate.getColumn("plane_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the standard deviation of the
     * out-of-plane distance for this atom.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return delegate.getColumn("dist_esd", DelegatingFloatColumn::new);
    }
}
