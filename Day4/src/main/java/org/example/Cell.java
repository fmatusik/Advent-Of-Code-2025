package org.example;

public class Cell {
    private final Coordinate position;
    private final boolean hasPaper;

    public Cell(Coordinate position, boolean hasPaper) {
        this.position = position;
        this.hasPaper = hasPaper;
    }

    public boolean hasPaper() {
        return hasPaper;
    }

    public Coordinate getPosition() {
        return position;
    }
}

