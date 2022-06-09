package gameFunctionality;

import gameFunctionality.pieces.PieceColor;

public class Square {

    // Stellt Buchstaben A-H dar
    private int horizontal;
    // Stellt Zahlen 1-8 dar
    private int vertical;
    // Kombination aus Zahl und Buchstabe für eine einzigartige ID für jedes einzelene Feld
    private String id;

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public String getId() {
        return id;
    }

    public static Move getMove(Square start, Square destination, PieceColor color) {
        int moveForward;
        int moveRight;

        moveForward = destination.getVertical() - start.getVertical();
        moveRight = start.getHorizontal() - destination.getHorizontal();

        if (color == PieceColor.BLACK) {
            moveForward *= -1;
            moveRight *= -1;
        }
        return new Move(moveForward, moveRight);
    }
}
