package com.company;

public class Queen extends Piece {

    public Queen(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("Q");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {

        if (board.getBoard()[startingXPosition][startingYPosition] != null) {


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
                return true;
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
                return true;
            }


            if (Math.abs(endingXPosition - startingXPosition) == Math.abs(endingYPosition - startingYPosition)) {


                for (int i = 1; i <= Math.abs(endingXPosition - startingXPosition); i++) {
                    if (endingXPosition > startingXPosition) {
                        System.out.println(startingYPosition + "  " + endingYPosition);
                        if (endingYPosition > startingYPosition) {

                            System.out.println("i " + i);
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
                return true;
            }


        }
        return false;
    }
}
