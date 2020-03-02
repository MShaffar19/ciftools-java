package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify information about the
 * standard reflections used in the diffraction measurement process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnStandard extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_standard";

    public DiffrnStandard(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The percentage decrease in the mean of the intensities for the
     * standard reflections at the start to the finish of the measurement
     * process. This value affords a measure of the overall decay in
     * crystal quality during measurement. Negative values only occur in
     * exceptional instances where the final intensities are greater than
     * the initial ones.  If no measurable decay has occurred, the
     * standard uncertainty should be quoted to indicate the maximum
     * possible value the decay might have.  A range of 3 standard
     * uncertainties is considered possible.  Thus 0.0(1) would indicate
     * a decay of less than 0.3% or an enhancement of less than 0.3%.
     * @return StrColumn
     */
    public StrColumn getDecayPercent() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_decay_percent"));
    }

    /**
     * 
     * Reflection count between the standard reflection measurements.
     * @return StrColumn
     */
    public StrColumn getIntervalCount() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_interval_count"));
    }

    /**
     * 
     * Time between the standard reflection measurements.
     * @return StrColumn
     */
    public StrColumn getIntervalTime() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_interval_time"));
    }

    /**
     * 
     * Number of unique standard reflections used in measurements.
     * @return StrColumn
     */
    public StrColumn getNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_number"));
    }

    /**
     * 
     * The average standard uncertainty of the individual standard scales
     * applied to the intensity data.
     * @return StrColumn
     */
    public StrColumn getScaleSuAverage() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_scale_su_average"));
    }
}