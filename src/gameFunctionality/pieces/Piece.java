package gameFunctionality.pieces;

import gameFunctionality.Game;
import gameFunctionality.Move;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Piece {
    private Color pieceColor;
    private PieceType type;
    private Movement movement;
    private Game game;

    public Piece(Color pieceColor, PieceType type, Movement movement, Game game) {
        this.pieceColor = pieceColor;
        this.type = type;
        this.movement = movement;
        this.game = game;
    }

    public List<Move> getAllPossibleMoves () {
        Piece[][] chessboard = getGame().getChessBoard();
        List<Move> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }
    public Game getGame() {
        return game;
    }

    public Color getPieceColor() {
        return pieceColor;
    }

    public PieceType getType() {
        return type;
    }

    public Movement getMovement() {
        return movement;
    }
}
