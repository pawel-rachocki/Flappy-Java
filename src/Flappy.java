import enums.BoardDimensions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Flappy extends JPanel{

    // Assets/Images
    Image backgroundImg;
    Image playerImg;
    Image topPipeImg;
    Image bottomPipeImg;


    Flappy(){
        setPreferredSize(new Dimension(BoardDimensions.BOARD_WIDTH.getValue(), BoardDimensions.BOARD_HEIGHT.getValue()));
        setBackground(Color.BLACK);

        // load assets
        backgroundImg = new ImageIcon(getClass().getResource("/assets/flappybirdbg.png")).getImage();
        playerImg = new ImageIcon(getClass().getResource("/assets/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/assets/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/assets/bottompipe.png")).getImage();
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        draw(graphics);

    }

    public void draw(Graphics graphics){
        // BackGround
        graphics.drawImage(backgroundImg,0,0,BoardDimensions.BOARD_WIDTH.getValue(),BoardDimensions.BOARD_HEIGHT.getValue(),null);
    }
}
