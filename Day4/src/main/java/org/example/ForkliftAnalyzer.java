package org.example;

public class ForkliftAnalyzer {

    public int countAccessible(Grid grid) {
        int count = 0;

        for (Cell cell : grid.getAllCells()) {
            if (grid.isAccessible(cell)) {
                count++;
            }
        }

        return count;
    }
}

