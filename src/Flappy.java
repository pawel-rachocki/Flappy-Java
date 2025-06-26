import enums.BoardDimensions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Flappy extends JPanel{

    Flappy(){
        setPreferredSize(new Dimension(BoardDimensions.BOARD_WIDTH.getValue(), BoardDimensions.BOARD_HEIGHT.getValue()));
    }

}
