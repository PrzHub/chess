package com.company;

public class Queen extends Piece {

    public Queen(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("Q");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {
        return false;
    }
}
