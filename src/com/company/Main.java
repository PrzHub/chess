package com.company;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        board.createPieces();
        board.putPiecesOnStartingPositions();

        board.makeAMove(3, 1, 3, 3);
        board.makeAMove(2,0,5,3);
        board.makeAMove(5,3,2,6);
        board.makeAMove(3,0,3,2);
        board.makeAMove(3,2,5,4);
        board.makeAMove(5,4,4,5);
        board.makeAMove(1,0,3,1);
        board.makeAMove(3,1, 2, 3);
        board.makeAMove(2,3, 3, 5);
        board.makeAMove(3,5, 2, 7);
        board.makeAMove(4,5,3,5);
        board.makeAMove(2,7,3,5);


        board.displayBoard();



 /*       for(Piece[] entry : board.getBoard()) {
            for (Piece qwe: entry) {
                try {
                    System.out.print(qwe.getName());
                    System.out.println(qwe instanceof King);
                }
                catch (Exception e) {}
            }
        }*/
      //  System.out.println(whiteRooks[0].xPosition);
    }
}
