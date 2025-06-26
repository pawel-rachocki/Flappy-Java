import enums.PlayerSize;

import java.awt.*;

public class Pipe {
    int x;
    int y;
    int width;
    int height;
    Image playerImg;
    boolean passed = false;

    public Pipe(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.width = PlayerSize.PLAYER_WIDTH.getValue();
        this.height = PlayerSize.PLAYER_HEIGHT.getValue();
        this.playerImg = img;
    }
}
