package com.company;

public class Knight extends Piece {

    public Knight(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("N");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {
        return false;
    }

}
