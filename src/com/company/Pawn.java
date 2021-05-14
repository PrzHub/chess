package com.company;

public class Pawn extends Piece{

    boolean hasEverMoved;

    public Pawn(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("P");
        hasEverMoved = false;
    }

    public boolean isHasEverMoved() {
        return hasEverMoved;
    }

    public void setHasEverMoved(boolean hasEverMoved) {
        this.hasEverMoved = hasEverMoved;
    }
}
