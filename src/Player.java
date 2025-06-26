import enums.PlayerSize;
import java.awt.Image;

public class Player {
    int x;
    int y;
    int width;
    int height;
    Image playerImg;

    public Player(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.width = PlayerSize.PLAYER_WIDTH.getValue();
        this.height = PlayerSize.PLAYER_HEIGHT.getValue();
        this.playerImg = img;
    }
}