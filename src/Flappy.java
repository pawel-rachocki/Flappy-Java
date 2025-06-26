import enums.BoardDimensions;
import enums.PlayerSize;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Flappy extends JPanel{

    // Assets/Images
    Image backgroundImg;
    Image playerImg;
    Image topPipeImg;
    Image bottomPipeImg;

    // Player
    int playerX = BoardDimensions.BOARD_WIDTH.getValue()/8;
    int playerY = BoardDimensions.BOARD_HEIGHT.getValue()/2;
    int playerWidth = PlayerSize.PLAYER_WIDTH.getValue();
    int playerHeight = PlayerSize.PLAYER_HEIGHT.getValue();

    // Game
    Player player;


    Flappy(){
        setPreferredSize(new Dimension(BoardDimensions.BOARD_WIDTH.getValue(), BoardDimensions.BOARD_HEIGHT.getValue()));
        setBackground(Color.BLACK);

        // load assets
        backgroundImg = new ImageIcon(getClass().getResource("/assets/flappybirdbg.png")).getImage();
        playerImg = new ImageIcon(getClass().getResource("/assets/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/assets/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/assets/bottompipe.png")).getImage();

        player = new Player(playerX,playerY,playerImg);
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        draw(graphics);

    }

    public void draw(Graphics graphics){
        // BackGround
        graphics.drawImage(backgroundImg,0,0,BoardDimensions.BOARD_WIDTH.getValue(),BoardDimensions.BOARD_HEIGHT.getValue(),null);
        graphics.drawImage(player.playerImg,player.x,player.y,player.width,player.height,null);
    }
}
