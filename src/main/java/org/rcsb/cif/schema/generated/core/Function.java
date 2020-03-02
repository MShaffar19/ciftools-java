package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The crystallographic functions the invoked in the definition
 * methods of CORE STRUCTURE data items defined and used with in
 * the Crystallographic Information Framework (CIF).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Function extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "function";

    public Function(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The function
     * r  =  AtomType( s )
     * 
     * returns an atom type symbol (element name) from the atom site label.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_AtomType"));
    }

    /**
     * 
     * The function
     * d  =  Closest( v, w )
     * 
     * returns the cell translation vector required to obtain the
     * closest cell-translated occurence of the vector V to the vector
     * W.
     * @return StrColumn
     */
    public StrColumn getClosest() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Closest"));
    }

    /**
     * 
     * The function
     * s  =  SeitzFromJones( j )
     * 
     * returns a 4x4 Seitz matrix from the Jones faithful representation of
     * the equivalent position which is a character string e.g. 1/2+x,-x,z.
     * @return StrColumn
     */
    public StrColumn getSeitzFromJones() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_SeitzFromJones"));
    }

    /**
     * 
     * The function
     * xyz' =  SymEquiv( symop, xyz )
     * 
     * returns a fractional coordinate vector xyz' which is input vector
     * xyz transformed by the input symop 'n_pqr' applied to the symmetry
     * equivalent matrix extracted from the category space_group_symop.
     * @return StrColumn
     */
    public StrColumn getSymEquiv() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_SymEquiv"));
    }

    /**
     * 
     * The function
     * m  =  SymKey( s )
     * 
     * returns an integer index to the Seitz matrices from the character
     * string of the form 'n_pqr'.
     * @return StrColumn
     */
    public StrColumn getSymKey() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_SymKey"));
    }

    /**
     * 
     * The function
     * v  =  SymLat( s )
     * 
     * returns a vector of the cell translations applied to the coordinates
     * from the character string of the form 'n_pqr'. i.e. p-5, q-5, r-5.
     * @return StrColumn
     */
    public StrColumn getSymLat() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_SymLat"));
    }

    /**
     * 
     * The function
     * s  =  Symop( n, t )
     * 
     * returns a character string of the form 'n_pqr' where n is the
     * symmetry equivalent site number and [p,q,r] is the cell translation
     * vector PLUS [5,5,5].
     * @return StrColumn
     */
    public StrColumn getSymop() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Symop"));
    }
}