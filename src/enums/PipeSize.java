package enums;

public enum PipeSize {
    PIPE_WIDTH(64),
    PIPE_HEIGHT(512);

    private final int value;

    PipeSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
