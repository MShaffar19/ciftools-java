package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe atom site information
 * used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSite extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site";

    public AtomSite(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Code for type of atomic displacement parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getAdpType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_adp_type"));
    }

    /**
     * 
     * Number of hydrogen atoms attached to the atom at this site
     * excluding any H atoms for which coordinates (measured or calculated)
     * are given.
     * @return StrColumn
     */
    public StrColumn getAttachedHydrogens() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_attached_hydrogens"));
    }

    /**
     * 
     * Equivalent isotropic atomic displacement parameter, B(equiv),
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * B(equiv) = (B~i~ B~j~ B~k~)^1/3^
     * 
     * B~n~  = the principal components of the orthogonalised B^ij^
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return StrColumn
     */
    public StrColumn getBEquivGeomMean() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_equiv_geom_mean"));
    }

    /**
     * 
     * Standard Uncertainty value for the
     * Equivalent isotropic atomic displacement parameter, B(equiv),
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * @return StrColumn
     */
    public StrColumn getBEquivGeomMeanSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_equiv_geom_mean_su"));
    }

    /**
     * 
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, B(equiv), in angstroms squared,
     * calculated from anisotropic temperature factor parameters.
     * 
     * B(equiv) = (1/3) sum~i~[sum~j~(B^ij^ a*~i~ a*~j~ a~i~ a~j~)]
     * 
     * a     = the real-space cell lengths
     * a*    = the reciprocal-space cell lengths
     * B^ij^ = 8 pi^2^ U^ij^
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44, 775-776.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return StrColumn
     */
    public StrColumn getBIsoOrEquiv() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_iso_or_equiv"));
    }

    /**
     * 
     * Standard Uncertainty value for the
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, B(equiv), in angstroms squared,
     * calculated from anisotropic temperature factor parameters.
     * @return StrColumn
     */
    public StrColumn getBIsoOrEquivSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B_iso_or_equiv_su"));
    }

    /**
     * 
     * The _atom_site.label of the atom site to which the 'geometry-
     * calculated' atom site is attached.
     * @return StrColumn
     */
    public StrColumn getCalcAttachedAtom() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_calc_attached_atom"));
    }

    /**
     * 
     * A standard code to signal if the site coordinates have been
     * determined from the intensities or calculated from the geometry
     * of surrounding sites, or have been assigned dummy coordinates.
     * @return StrColumn
     */
    public StrColumn getCalcFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_calc_flag"));
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
     * This number links an atom site to the chemical connectivity list.
     * It must match a number specified by _chemical_conn_atom.number.
     * @return StrColumn
     */
    public StrColumn getChemicalConnNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_chemical_conn_number"));
    }

    /**
     * 
     * A description of the constraints applied to parameters at this
     * site during refinement. See also _atom_site.refinement_flags
     * and _refine_ls.number_constraints.
     * @return StrColumn
     */
    public StrColumn getConstraints() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_constraints"));
    }

    /**
     * 
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_description"));
    }

    /**
     * 
     * A code which identifies a cluster of atoms that show long range
     * positional disorder but are locally ordered. Within each such
     * cluster of atoms, _atom_site.disorder_group is used to identify
     * the sites that are simultaneously occupied. This field is only
     * needed if there is more than one cluster of disordered atoms
     * showing independent local order.
     * @return StrColumn
     */
    public StrColumn getDisorderAssembly() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_disorder_assembly"));
    }

    /**
     * 
     * A code that identifies a group of positionally disordered atom
     * sites that are locally simultaneously occupied. Atoms that are
     * positionally disordered over two or more sites (e.g. the H
     * atoms of a methyl group that exists in two orientations) can
     * be assigned to two or more groups. Sites belonging to the same
     * group are simultaneously occupied, but those belonging to
     * different groups are not. A minus prefix (e.g. "-1") is used to
     * indicate sites disordered about a special position.
     * @return StrColumn
     */
    public StrColumn getDisorderGroup() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_disorder_group"));
    }

    /**
     * 
     * Vector of atom site coordinates projected onto the crystal unit
     * cell as fractions of the cell lengths.
     * @return StrColumn
     */
    public StrColumn getFractXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_fract_xyz"));
    }

    /**
     * 
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site. The
     * value must lie in the 99.97% Gaussian confidence interval
     * -3u =&lt; x =&lt; 1 + 3u. The _enumeration.range of 0.0:1.0 is thus
     * correctly interpreted as meaning (0.0 - 3u) =&lt; x =&lt; (1.0 + 3u).
     * @return StrColumn
     */
    public StrColumn getOccupancy() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_occupancy"));
    }

    /**
     * 
     * Standard Uncertainty value for the
     * The fraction of the atom type present at this site.
     * @return StrColumn
     */
    public StrColumn getOccupancySu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_occupancy_su"));
    }

    /**
     * 
     * A concatenated series of single-letter codes which indicate the
     * refinement restraints or constraints applied to this site. This
     * item should not be used. It has been replaced by
     * _atom_site.refinement_flags_posn, _adp and _occupancy. It is
     * retained in this dictionary only to provide compatibility with
     * legacy CIFs.
     * @return StrColumn
     */
    public StrColumn getRefinementFlags() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_refinement_flags"));
    }

    /**
     * 
     * A code which indicates the refinement restraints or constraints
     * applied to the atomic displacement parameters of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsAdp() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_refinement_flags_adp"));
    }

    /**
     * 
     * A code which indicates the refinement restraints or constraints
     * applied to the occupancy of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsOccupancy() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_refinement_flags_occupancy"));
    }

    /**
     * 
     * A code which indicates the refinement restraints or constraints
     * applied to the positional coordinates of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsPosn() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_refinement_flags_posn"));
    }

    /**
     * 
     * A description of restraints applied to specific parameters at
     * this site during refinement. See also _atom_site.refinement_flags
     * and _refine_ls.number_restraints.
     * @return StrColumn
     */
    public StrColumn getRestraints() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_restraints"));
    }

    /**
     * 
     * The number of different sites that are generated by the
     * application of the space-group symmetry to the coordinates
     * given for this site. It is equal to the multiplicity given
     * for this Wyckoff site in International Tables for Cryst.
     * Vol. A (2002). It is equal to the multiplicity of the general
     * position divided by the order of the site symmetry given in
     * _atom_site.site_symmetry_order.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryMultiplicity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_multiplicity"));
    }

    /**
     * 
     * The number of times application of the crystallographic symmetry
     * to the coordinates for this site generates the same coordinates.
     * That is:
     * multiplicity of the general position
     * ------------------------------------
     * _atom_site.site_symmetry_multiplicity
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryOrder() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_order"));
    }

    /**
     * 
     * The symmetric anisotropic atomic displacement tensor beta[I,J]
     * appears in a structure factor expression as:
     * 
     * t = exp -[ beta11 h h + ............ 2 beta23 k l ]
     * 
     * It is related to the adp matrices U(IJ) and B(IJ) as follows:
     * 
     * t = exp -2pi**2 ( U11    h h a* a* + ...... 2 U23    k l b* c* )
     * t = exp - 0.25  ( B11    h h a* a* + ...... 2 B23    k l b* c* )
     * @return StrColumn
     */
    public StrColumn getTensorBeta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_tensor_beta"));
    }

    /**
     * 
     * A code to identify the atom specie(s) occupying this site.
     * This code must match a corresponding _atom_type.symbol. The
     * specification of this code is optional if component_0 of the
     * _atom_site.label is used for this purpose. See _atom_type.symbol.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type_symbol"));
    }

    /**
     * 
     * Equivalent isotropic atomic displacement parameter, U(equiv),
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * U(equiv) = (U~i~ U~j~ U~k~)^1/3^
     * 
     * U~n~ = the principal components of the orthogonalised U^ij^
     * @return StrColumn
     */
    public StrColumn getUEquivGeomMean() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_equiv_geom_mean"));
    }

    /**
     * 
     * Standard uncertainty values (esds) of the U(equiv).
     * @return StrColumn
     */
    public StrColumn getUEquivGeomMeanSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_equiv_geom_mean_su"));
    }

    /**
     * 
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic  displacement parameter, U(equiv), in angstroms squared,
     * calculated from anisotropic atomic displacement  parameters.
     * 
     * U(equiv) = (1/3) sum~i~[sum~j~(U^ij^ a*~i~ a*~j~ a~i~ a~j~)]
     * 
     * a  = the real-space cell lengths
     * a* = the reciprocal-space cell lengths
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44, 775-776.
     * @return StrColumn
     */
    public StrColumn getUIsoOrEquiv() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_iso_or_equiv"));
    }

    /**
     * 
     * Standard uncertainty values (esds) of the U(iso) or U(equiv).
     * @return StrColumn
     */
    public StrColumn getUIsoOrEquivSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_U_iso_or_equiv_su"));
    }

    /**
     * 
     * The Wyckoff symbol (letter) as listed in the space-group section
     * of International Tables for Crystallography, Vol. A (1987).
     * @return StrColumn
     */
    public StrColumn getWyckoffSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Wyckoff_symbol"));
    }
}