package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Parameter and topology files used in X-PLOR/CNS refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxXplorFile extends DelegatingCategory {
    public PdbxXplorFile(Category delegate) {
        super(delegate);
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getSerialNo() {
        return delegate.getColumn("serial_no", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_xplor_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * Parameter file name in X-PLOR/CNS refinement.
     * @return StrColumn
     */
    public StrColumn getParamFile() {
        return delegate.getColumn("param_file", DelegatingStrColumn::new);
    }

    /**
     * Topology file name in X-PLOR/CNS refinement.
     * @return StrColumn
     */
    public StrColumn getTopolFile() {
        return delegate.getColumn("topol_file", DelegatingStrColumn::new);
    }
}
