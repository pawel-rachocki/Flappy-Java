import enums.BoardDimensions;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {


        JFrame game = new JFrame("Flappy");
        game.setSize(BoardDimensions.BOARD_WIDTH.getValue(),BoardDimensions.BOARD_HEIGHT.getValue());
        game.setVisible(true);
        game.setLocationRelativeTo(null); // set game frame in the middle of the screen
        game.setResizable(false); // dont let user to resize the game frame
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
