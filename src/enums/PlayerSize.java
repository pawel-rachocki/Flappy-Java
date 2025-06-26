package enums;

public enum PlayerSize {
    PLAYER_WIDTH(34),
    PLAYER_HEIGHT(24);

    private final int value;

    PlayerSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
