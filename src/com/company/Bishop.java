package com.company;

public class Bishop extends Piece {

    public Bishop(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("B");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {

        if (board.getBoard()[startingXPosition][startingYPosition] != null) {

            if (Math.abs(endingXPosition - startingXPosition) != Math.abs(endingYPosition - startingYPosition)) {
                return false;
            }

            for (int i = 1; i <= Math.abs(endingXPosition - startingXPosition); i++) {
                if (endingXPosition > startingXPosition) {
                    if (endingYPosition > startingYPosition) {
                        if (board.getBoard()[startingXPosition + i][startingYPosition + i] != null) {
                            return false;
                        }
                    } else if (endingYPosition < startingYPosition) {
                        if (board.getBoard()[startingXPosition + i][startingYPosition - i] != null) {
                            return false;
                        }
                    }
                } else if (endingXPosition < startingXPosition) {

                    if (endingYPosition > startingYPosition) {
                        if (board.getBoard()[startingXPosition - i][startingYPosition + i] != null) {
                            return false;
                        }
                    } else if (endingYPosition < startingYPosition) {
                        if (board.getBoard()[startingXPosition - i][startingYPosition - i] != null) {
                            return false;
                        }
                    }

                }


            }
        }


        return true;
    }
}
