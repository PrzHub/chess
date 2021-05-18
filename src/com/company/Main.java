package com.company;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        board.createPieces();
        board.putPiecesOnStartingPositions();


        board.makeAMove(0,1,0,3);

        board.displayBoard();

        board.makeAMove(0,0,0,6);

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
