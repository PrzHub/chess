package com.company;

public class Rook extends Piece {

    boolean hasEverMoved;

    public Rook(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        hasEverMoved = false;
        super.setName("R");
    }

}
