/*
 * codjo.net
 *
 * Common Apache License 2.0
 */
package net.codjo.segmentation.server.participant.common;
import net.codjo.segmentation.server.preference.family.Row;
import java.util.ArrayList;
import java.util.List;
/**
 * D�crit une page de donn�es � traiter (Liste de {@link Row}).
 */
public class Page {
    private static final int MAX_ROWS_PER_PAGE = 1000;
    private List<Row> rows = new ArrayList<Row>(MAX_ROWS_PER_PAGE);


    public int getMaxRow() {
        return MAX_ROWS_PER_PAGE;
    }


    public void addRow(Row row) {
        if (isFull()) {
            throw new IllegalStateException("La page est pleine");
        }
        rows.add(row);
    }


    public Row getRow(int index) {
        return rows.get(index);
    }


    public boolean isFull() {
        return rows.size() == MAX_ROWS_PER_PAGE;
    }


    public int getRowCount() {
        return rows.size();
    }
}
