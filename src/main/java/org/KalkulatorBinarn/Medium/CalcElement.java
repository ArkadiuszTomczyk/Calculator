package org.KalkulatorBinarn;

import java.util.ArrayList;
import java.util.List;

import static org.KalkulatorBinarn.CalcRow.EMPTY;

public class CalcElement {
    private int value;
    private List<Integer> possibleValues = new ArrayList<>();

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public CalcElement(Integer value) {
        this.value = value;
        if (value == EMPTY) {
            for (int n = 1; n <= 9; n++) {
                possibleValues.add(n);
            }
        }
    }
}
