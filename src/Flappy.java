import enums.BoardDimensions;
import enums.PlayerSize;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;



public class Flappy extends JPanel implements ActionListener,KeyListener{

    // Assets/Images
    Image backgroundImg;
    Image playerImg;
    Image topPipeImg;
    Image bottomPipeImg;

    // Player
    int playerX = BoardDimensions.BOARD_WIDTH.getValue()/8;
    int playerY = BoardDimensions.BOARD_HEIGHT.getValue()/2;

    // Pipes
    int pipeX = BoardDimensions.BOARD_WIDTH.getValue();
    int pipeY = 0;

    // Game logic
    Player player;
    int velocityX = -4; // for pipes
    int velocityY = 0;
    int gravity = 1;

    ArrayList<Pipe> pipes;

    Timer gameLoop;
    Timer pipesTimer;


    Flappy(){
        setPreferredSize(new Dimension(BoardDimensions.BOARD_WIDTH.getValue(), BoardDimensions.BOARD_HEIGHT.getValue()));
        setFocusable(true);
        addKeyListener(this);

        // load assets
        backgroundImg = new ImageIcon(getClass().getResource("/assets/flappybirdbg.png")).getImage();
        playerImg = new ImageIcon(getClass().getResource("/assets/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/assets/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/assets/bottompipe.png")).getImage();

        // player
        player = new Player(playerX,playerY,playerImg);

        // pipes
        pipes = new ArrayList<Pipe>();

        // place pipes timer
        pipesTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipes();
            }
        });
        pipesTimer.start();

        // game timer
        this.gameLoop = new Timer(1000/60,this);
        this.gameLoop.start();

    }

    public void placePipes(){
        Pipe topPipe = new Pipe(pipeX,pipeY,topPipeImg);
        pipes.add(topPipe);

    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        draw(graphics);

    }

    public void draw(Graphics graphics){
        // BackGround
        graphics.drawImage(backgroundImg,0,0,BoardDimensions.BOARD_WIDTH.getValue(),BoardDimensions.BOARD_HEIGHT.getValue(),null);

        // Player
        graphics.drawImage(player.playerImg,player.x,player.y,player.width,player.height,null);

        // Pipes
        for (int i = 0; i < pipes.size(); i++){
            Pipe pipe = pipes.get(i);
            graphics.drawImage(pipe.pipeImg, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }
    }

    public void move(){
        // player
        velocityY += gravity;
        player.y += this.velocityY;
        player.y = Math.max(player.y,0);

        for (int i = 0; i < pipes.size(); i++){
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            this.velocityY = -9;

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}
