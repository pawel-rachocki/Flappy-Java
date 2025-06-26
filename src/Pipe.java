import enums.PipeSize;
import enums.PlayerSize;

import java.awt.*;

public class Pipe {
    int x;
    int y;
    int width;
    int height;
    Image pipeImg;
    boolean passed = false;

    public Pipe(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.width = PipeSize.PIPE_WIDTH.getValue();
        this.height = PipeSize.PIPE_HEIGHT.getValue();
        this.pipeImg = img;
    }
}
