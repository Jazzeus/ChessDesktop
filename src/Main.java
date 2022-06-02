import gui.Chessboard;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        int width = 1000;
        int height = 1000;
        mainFrame.setSize(width, height);
        Chessboard chessboard = new Chessboard(width, height);
        mainFrame.add(chessboard);
        mainFrame.setVisible(true);
    }
}
