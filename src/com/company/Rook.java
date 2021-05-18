package com.company;

public class Rook extends Piece {

    boolean hasEverMoved;

    public Rook(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        hasEverMoved = false;
        super.setName("R");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {
        System.out.println("rook");

        // does piece exists?
        if (board.getBoard()[startingXPosition][startingYPosition] != null) {
            // moving forward to not occupied tile:

            if (startingXPosition == endingXPosition) {
                for (int i = 1; i <= Math.abs(endingYPosition - startingYPosition); i++) {
                    if (endingYPosition > startingYPosition) {
                        if (board.getBoard()[startingXPosition][startingYPosition + i] != null) {
                            return false;
                        }
                    }
                    if (endingYPosition < startingYPosition) {
                        if (board.getBoard()[startingXPosition][startingYPosition - i] != null) {
                            return false;
                        }
                    }
                }
            }

            if (startingYPosition == endingYPosition) {
                for (int i = 1; i < Math.abs(endingXPosition - startingXPosition); i++) {
                    if (endingXPosition > startingXPosition) {
                        if (board.getBoard()[startingXPosition + i][startingYPosition] != null) {
                            return false;
                        }
                    }
                    if (endingYPosition < startingYPosition) {
                        if (board.getBoard()[startingXPosition - i][startingYPosition] != null) {
                            return false;
                        }
                    }
                }
            }

            return true;
        }
        return false;


    }

}
