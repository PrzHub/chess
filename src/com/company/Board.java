package com.company;

public class Board {
    static final int SIZE = 8;

    Piece[][] board = new Piece[8][8];

    Piece[] allPieces = new Piece[32];

    public Piece[][] getBoard() {
        return board;
    }


    public void createPieces() {

        Pawn[] whitePawns = new Pawn[SIZE];
        Pawn[] blackPawns = new Pawn[SIZE];

        for (int i = 0; i < SIZE; i++) {
            whitePawns[i] = new Pawn(true, i, 1);
            blackPawns[i] = new Pawn(false, i, 6);
            allPieces[i] = whitePawns[i];
            allPieces[i + 16] = blackPawns[i];
        }


        Rook[] whiteRooks = new Rook[2];
        allPieces[8] = whiteRooks[0] = new Rook(true, 0, 0);
        allPieces[9] = whiteRooks[1] = new Rook(true, 7, 0);

        Rook[] blackRooks = new Rook[2];
        allPieces[8 + 16] = blackRooks[0] = new Rook(false, 0, 7);
        allPieces[9 + 16] = blackRooks[1] = new Rook(false, 7, 7);

        Knight[] whiteKnights = new Knight[2];
        allPieces[10] = whiteKnights[0] = new Knight(true, 1, 0);
        allPieces[11] = whiteKnights[1] = new Knight(true, 6, 0);

        Knight[] blackKnights = new Knight[2];
        allPieces[10 + 16] = blackKnights[0] = new Knight(false, 1, 7);
        allPieces[11 + 16] = blackKnights[1] = new Knight(false, 6, 7);

        Bishop[] whiteBishops = new Bishop[2];
        allPieces[12] = whiteBishops[0] = new Bishop(true, 2, 0);
        allPieces[13] = whiteBishops[1] = new Bishop(true, 5, 0);

        Bishop[] blackBishops = new Bishop[2];
        allPieces[12 + 16] = blackBishops[0] = new Bishop(false, 2, 7);
        allPieces[13 + 16] = blackBishops[1] = new Bishop(false, 5, 7);

        Queen whiteQueen = new Queen(true, 3, 0);
        allPieces[14] = whiteQueen;
        Queen blackQueen = new Queen(false, 3, 7);
        allPieces[14 + 16] = blackQueen;

        King whiteKing = new King(true, 4, 0);
        allPieces[15] = whiteKing;
        King blackKing = new King(false, 4, 7);
        allPieces[15 + 16] = blackKing;

    }

    public void putPiecesOnStartingPositions() {


        for (int i = 0; i < 32; i++) {
            board[allPieces[i].getxPosition()][allPieces[i].getyPosition()] = allPieces[i];
        }
    }

    public void displayBoard() {
        for (int i = 7; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                if (board[j][i] != null) {
                    if (board[j][i].isWhite())
                        System.out.print("w");
                    else
                        System.out.print("b");
                    System.out.print(board[j][i].getName() + " ");
                } else {
                    System.out.print(" 0 ");
                }
            }
        }
    }

    public void makeAMove(int startingXPos, int startingYPos, int endingXPos, int endingYPos) {

        if (board[startingXPos][startingYPos] != null && board[startingXPos][startingYPos].isMovePossible(startingXPos, startingYPos, endingXPos, endingYPos, this)) {
            board[endingXPos][endingYPos] = board[startingXPos][startingYPos];

            board[startingXPos][startingYPos] = null;
        }
    }

}
