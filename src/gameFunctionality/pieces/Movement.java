package gameFunctionality.pieces;

import gameFunctionality.Game;
import gameFunctionality.Move;

public class Movement {

    private int diagonal;
    private int horizontal;
    private int vertical;
    private boolean isHorse;
    private boolean isBauer;
    private Piece piece;

    public Movement(int diagonal, int horizontal, int vertical, boolean isHorse, boolean isBauer, Piece piece) {
        this.diagonal = diagonal;
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.isHorse = isHorse;
        this.isBauer = isBauer;
        this.piece = piece;
    }

    public boolean isPossible(Move move) {
        Piece[][] chessboard = getPiece().getGame().getChessBoard();

        return true;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public boolean isHorse() {
        return isHorse;
    }

    public boolean isBauer() {
        return isBauer;
    }
}
