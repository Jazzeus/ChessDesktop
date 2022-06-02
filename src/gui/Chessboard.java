package gui;

import javax.swing.*;
import java.awt.*;

public class Chessboard extends JPanel {
    Color boardColor1 = Color.DARK_GRAY;
    Color boardColor2 = Color.LIGHT_GRAY;
    Color pieceColor1 = Color.BLACK;
    Color pieceColor2 = Color.WHITE;
    public Chessboard(int width, int height) {
        // Super ruft den Konstruktor von dem vererbten JPanel auf.
        super(null);
        setSize(width, height);
        setBackground(Color.red);
    }
}
