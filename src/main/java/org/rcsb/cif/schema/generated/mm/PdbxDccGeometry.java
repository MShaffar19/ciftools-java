package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record the overall deviations about
 * geometry (such as bond length, angle, dihedral, chirality,
 * planarity). These data are calculated with the phenix module
 * model_vs_data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccGeometry extends DelegatingCategory {
    public PdbxDccGeometry(Category delegate) {
        super(delegate);
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return delegate.getColumn("pdbid", DelegatingStrColumn::new);
    }

    /**
     * Percentage of outliers in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranOutlierPercent() {
        return delegate.getColumn("Ramachandran_outlier_percent", DelegatingFloatColumn::new);
    }

    /**
     * Number of outliers in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranOutlierNumber() {
        return delegate.getColumn("Ramachandran_outlier_number", DelegatingIntColumn::new);
    }

    /**
     * Percentage of allowed residues in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranAllowedPercent() {
        return delegate.getColumn("Ramachandran_allowed_percent", DelegatingFloatColumn::new);
    }

    /**
     * Number of allowed residues in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranAllowedNumber() {
        return delegate.getColumn("Ramachandran_allowed_number", DelegatingIntColumn::new);
    }

    /**
     * Percentage of favored residues in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranFavoredPercent() {
        return delegate.getColumn("Ramachandran_favored_percent", DelegatingFloatColumn::new);
    }

    /**
     * Number of favored residues in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranFavoredNumber() {
        return delegate.getColumn("Ramachandran_favored_number", DelegatingIntColumn::new);
    }

    /**
     * Percentage of rotamer outliers.
     * @return FloatColumn
     */
    public FloatColumn getRotamerOutliersPercent() {
        return delegate.getColumn("rotamer_outliers_percent", DelegatingFloatColumn::new);
    }

    /**
     * Number of rotamer outliers.
     * @return IntColumn
     */
    public IntColumn getRotamerOutliersNumber() {
        return delegate.getColumn("rotamer_outliers_number", DelegatingIntColumn::new);
    }

    /**
     * Number of Cbeta deviations &gt;0.25A.
     * @return IntColumn
     */
    public IntColumn getCbetaDeviations() {
        return delegate.getColumn("cbeta_deviations", DelegatingIntColumn::new);
    }

    /**
     * All atom score is determined by steric overlaps &gt;0.4A per 1000
     * atoms.
     * @return FloatColumn
     */
    public FloatColumn getAllAtomClashscore() {
        return delegate.getColumn("all_atom_clashscore", DelegatingFloatColumn::new);
    }

    /**
     * The overall score for the geometry (the smaller the better).
     * @return FloatColumn
     */
    public FloatColumn getOverallScore() {
        return delegate.getColumn("overall_score", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for bond lengths (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getBondOverallRms() {
        return delegate.getColumn("bond_overall_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for bond lengths (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getBondOverallMax() {
        return delegate.getColumn("bond_overall_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for bond lengths (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getBondLigandRms() {
        return delegate.getColumn("bond_ligand_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for bond lengths (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getBondLigandMax() {
        return delegate.getColumn("bond_ligand_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for bond angles (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getAngleOverallRms() {
        return delegate.getColumn("angle_overall_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for bond angles (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getAngleOverallMax() {
        return delegate.getColumn("angle_overall_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for bond angles (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getAngleLigandRms() {
        return delegate.getColumn("angle_ligand_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for bond angles (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getAngleLigandMax() {
        return delegate.getColumn("angle_ligand_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for dihedrals (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getDihedralOverallRms() {
        return delegate.getColumn("dihedral_overall_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for dihedrals (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getDihedralOverallMax() {
        return delegate.getColumn("dihedral_overall_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for chirality (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getChiralityOverallRms() {
        return delegate.getColumn("chirality_overall_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for chirality (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getChiralityOverallMax() {
        return delegate.getColumn("chirality_overall_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall root mean square deviation for planarity (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getPlanarityOverallRms() {
        return delegate.getColumn("planarity_overall_rms", DelegatingFloatColumn::new);
    }

    /**
     * The maximum root mean square deviation for planarity (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getPlanarityOverallMax() {
        return delegate.getColumn("planarity_overall_max", DelegatingFloatColumn::new);
    }

    /**
     * The overall on-bonded distance (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedRms() {
        return delegate.getColumn("non-bonded_rms", DelegatingFloatColumn::new);
    }
}
