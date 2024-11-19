public class MarsRover {

    private String INITIAL_STATE = "0:0:N";

    private Direction direction = Direction.NORTH;

    private String state;

    MarsRover(Direction direction) {
        this.direction = direction;
        this.state = INITIAL_STATE;
    }

    MarsRover() {
        this.state = INITIAL_STATE;
    }

    public String showStatus() {
        return state;
    }

    public String turnLeft() {
        switch (direction) {
            case NORTH -> direction = Direction.WEST;
            case WEST ->  direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.NORTH;
        }
        return "0:0:" + direction.getDirection();
    }

    public String turnRight() {
        switch (direction) {
            case NORTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.WEST;
            case WEST -> direction = Direction.NORTH;
        }
        return "0:0:" + direction.getDirection();
    }

    public String moveForward() {
        switch (direction) {
            case NORTH -> {
                return "0:1:N";
            }
            case EAST -> {
                return "1:0:E";
            }
            case SOUTH -> {
                return "0:-1:S";
            }
            case WEST -> {
                return "-1:0:W";
            }
            default -> {
                return null;
            }
        }
    }

    public String executeCommand(String command) {

        if (command.equals("L")) {
            return turnLeft();
        } else if (command.equals("R")) {
            return turnRight();
        } else {
            return moveForward();
        }
    }
}
