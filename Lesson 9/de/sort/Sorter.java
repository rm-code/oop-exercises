package de.sort;

import de.sort.Sortable;

public class Sorter {
    public void sort(Sortable[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - i; j++) {
                if ( toSort[j].isBigger(toSort[j + 1]) > 0 ) {
                    Sortable temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
    }
}
