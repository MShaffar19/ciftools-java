package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
 * define the names and synonyms of the entity name taxonomy.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityNameTaxonomy extends DelegatingCategory {
    public PdbxEntityNameTaxonomy(Category delegate) {
        super(delegate);
    }

    /**
     * This data item holds an node identifier in the
     * entity name taxonomy tree.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item holds an entity name or synonym.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * This data item classifies the entity name within
     * a taxonomic node.
     * @return StrColumn
     */
    public StrColumn getNameType() {
        return delegate.getColumn("name_type", DelegatingStrColumn::new);
    }
}
