package gameFunctionality;

import gameFunctionality.pieces.Piece;

public class Game {

    private Piece[][] chessBoard = new Piece[8][8];

    public Piece[][] getChessBoard() {
        return chessBoard;
    }
}
