public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction.charAt(0);
    }
}
