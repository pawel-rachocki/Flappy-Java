package enums;

public enum BoardDimensions {
    BOARD_WIDTH(360),
    BOARD_HEIGHT(640);
    private final int value;

    BoardDimensions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
