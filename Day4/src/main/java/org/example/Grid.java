package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private final Cell[][] cells;
    private final int rows;
    private final int cols;

    private static final int[][] DIRECTIONS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1},          { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
    };

    public Grid(List<String> input) {
        rows = input.size();
        cols = input.get(0).length();
        cells = new Cell[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char ch = input.get(r).charAt(c);
                cells[r][c] = new Cell(
                        new Coordinate(r, c),
                        ch == '@'
                );
            }
        }
    }

    public boolean isAccessible(Cell cell) {
        if (!cell.hasPaper()) return false;

        int count = 0;
        int r = cell.getPosition().getRow();
        int c = cell.getPosition().getCol();

        for (int[] d : DIRECTIONS) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (isInside(nr, nc) && cells[nr][nc].hasPaper()) {
                count++;
            }
        }

        return count < 4;
    }

    private boolean isInside(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    public List<Cell> getAllCells() {
        List<Cell> result = new ArrayList<>();
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}

