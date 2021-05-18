package com.company;

public class Pawn extends Piece {

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

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {

        System.out.println("pawn");

        // does piece exists?
        if (board.getBoard()[startingXPosition][startingYPosition] != null) {
            // moving forward to not occupied tile:
            if (startingXPosition == endingXPosition && board.getBoard()[endingXPosition][endingYPosition] == null) {
                //with white pawn:
                if (board.getBoard()[startingXPosition][startingYPosition].isWhite()) {
                    // by one tile
                    if (startingYPosition + 1 == endingYPosition) {
                        board.getBoard()[startingXPosition][startingYPosition].setHasEverMoved(true);
                        return true;
                        // by two tiles if this is pawn's first move and nothing blocks it
                    } else if (startingYPosition + 2 == endingYPosition && board.getBoard()[startingXPosition][startingYPosition+1] == null && !board.getBoard()[startingXPosition][startingYPosition].isHasEverMoved()) {
                        board.getBoard()[startingXPosition][startingYPosition].setHasEverMoved(true);
                        return true;
                    } else {
                        return false;
                    }
                } //with black pawn
                else  {
                    // by one tile
                    if (startingYPosition - 1 == endingYPosition) {
                        board.getBoard()[startingXPosition][startingYPosition].setHasEverMoved(true);
                        return true;
                        // by two tiles if this is pawn's first move
                    } else if (startingYPosition - 2 == endingYPosition && board.getBoard()[startingXPosition][startingYPosition-1] == null && !board.getBoard()[startingXPosition][startingYPosition].isHasEverMoved()) {
                        board.getBoard()[startingXPosition][startingYPosition].setHasEverMoved(true);
                        return true;
                    } else{
                        return false;
                    }
                }
            }
            return false;
        }
        return false;



    }
}
