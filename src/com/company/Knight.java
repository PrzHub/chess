package com.company;

public class Knight extends Piece {

    public Knight(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        super.setName("N");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {

        if (board.getBoard()[startingXPosition][startingYPosition] != null) {

            if(board.getBoard()[endingXPosition][endingYPosition] == null){
                if((Math.abs(endingXPosition - startingXPosition) == 1 && Math.abs(endingYPosition - startingYPosition) == 2) ||
                        (Math.abs(endingXPosition - startingXPosition) == 2 && Math.abs(endingYPosition - startingYPosition) == 1)){
                    return true;
                }
            }
            else if(board.getBoard()[endingXPosition][endingYPosition].isWhite() != board.getBoard()[startingXPosition][startingYPosition].isWhite()){
                return true;

            }
        }
        return false;

    }

}
