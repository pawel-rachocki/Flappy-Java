package enums;

public enum PipeSize {
    PIPE_WIDTH(34),
    PIPE_HEIGHT(24);

    private final int value;

    PipeSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
