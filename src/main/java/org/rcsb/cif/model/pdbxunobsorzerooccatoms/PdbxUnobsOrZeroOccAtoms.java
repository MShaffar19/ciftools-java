package org.rcsb.cif.model.pdbxunobsorzerooccatoms;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxUnobsOrZeroOccAtoms extends BaseCategory {
    public PdbxUnobsOrZeroOccAtoms(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxUnobsOrZeroOccAtoms(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxUnobsOrZeroOccAtoms(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_unobs_or_zero_occ_atoms.id must uniquely identify
     * each item in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of polymer flag indicates whether the unobserved or zero
     * occupancy atom is part of a polymer chain
     * @return PolymerFlag
     */
    public PolymerFlag getPolymerFlag() {
        return (PolymerFlag) (isText ? textFields.computeIfAbsent("polymer_flag",
                PolymerFlag::new) : getBinaryColumn("polymer_flag"));
    }

    /**
     * The value of occupancy flag indicates whether the atom is
     * either unobserved (=1) or has zero occupancy (=0)
     * @return OccupancyFlag
     */
    public OccupancyFlag getOccupancyFlag() {
        return (OccupancyFlag) (isText ? textFields.computeIfAbsent("occupancy_flag",
                OccupancyFlag::new) : getBinaryColumn("occupancy_flag"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return PDBModelNum
     */
    public PDBModelNum getPDBModelNum() {
        return (PDBModelNum) (isText ? textFields.computeIfAbsent("PDB_model_num",
                PDBModelNum::new) : getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * Part of the identifier for the unobserved or zero occupancy atom.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }
}
