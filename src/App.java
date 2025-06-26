import enums.BoardDimensions;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame game = new JFrame("Flappy");
        game.setSize(BoardDimensions.BOARD_WIDTH.getValue(),BoardDimensions.BOARD_HEIGHT.getValue());
        game.setLocationRelativeTo(null); // set game frame in the middle of the screen
        game.setResizable(false); // dont let user to resize the game frame
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flappy flappy = new Flappy();
        game.add(flappy);
        game.pack(); // BoardDimensions.BOARD_WIDTH && BoardDimensions.BOARD_HEIGHT excluding title bar

        flappy.requestFocus();
        game.setVisible(true);

    }
}
