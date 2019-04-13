package org.rcsb.cif.model;

public interface CifColumn {
    String getStringData(int row);

    String getName();

    int getRowCount();

    ValueKind getValueKind(int row);
}
