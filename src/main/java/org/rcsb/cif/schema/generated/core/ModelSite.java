package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe atomic sites and
 * connections in the proposed atomic model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ModelSite extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "model_site";

    public ModelSite(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The set of three adp eigenvales and associated eigenvectors
     * in the form of 4 element List. Each list has the form
     * 
     * (val, vecX, vecY, vecZ)
     * 
     * where the vector elements are direction cosines to the orthogonal
     * axes X,Y,Z. The lists are sorted in descending magnitude of val.
     * That is, the list with the largest val is first, and the smallest
     * val is last.
     * @return StrColumn
     */
    public StrColumn getAdpEigenSystem() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_adp_eigen_system"));
    }

    /**
     * 
     * Matrix of dimensionless anisotropic atomic displacement parameters.
     * @return StrColumn
     */
    public StrColumn getAdpMatrixBeta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_adp_matrix_beta"));
    }

    /**
     * 
     * Vector of Cartesian (orthogonal angstrom) atom site coordinates.
     * @return StrColumn
     */
    public StrColumn getCartnXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Cartn_xyz"));
    }

    /**
     * 
     * Display colour code assigned to this atom site. Note that the
     * possible colours are enumerated in the colour_RGB list, and
     * the default code is enumerated in the colour_hue list.
     * @return StrColumn
     */
    public StrColumn getDisplayColour() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_display_colour"));
    }

    /**
     * 
     * Vector of fractional atom site coordinates.
     * @return StrColumn
     */
    public StrColumn getFractXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_fract_xyz"));
    }

    /**
     * 
     * Identifier of model site in terms of the atom site label and
     * symmetry operator.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Index number of an atomic site in the connected molecule.
     * @return StrColumn
     */
    public StrColumn getIndex() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index"));
    }

    /**
     * 
     * Code identifies a site in the atom_site category of data.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_label"));
    }

    /**
     * 
     * Index number of a distinct molecules in the cell, not related by
     * symmetry.
     * @return StrColumn
     */
    public StrColumn getMoleIndex() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_mole_index"));
    }

    /**
     * 
     * Atomic radius of atom located at this site.
     * @return StrColumn
     */
    public StrColumn getRadiusBond() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_radius_bond"));
    }

    /**
     * 
     * Atomic contact radius of atom specie located at this site.
     * @return StrColumn
     */
    public StrColumn getRadiusContact() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_radius_contact"));
    }

    /**
     * 
     * Code to identify the atom specie(s) occupying this site.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type_symbol"));
    }
}