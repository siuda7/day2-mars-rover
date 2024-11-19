public class MarsRover {

    private String INITIAL_STATE = "0:0:N";

    private Direction direction;

    private String state;

    MarsRover() {
        this.direction = Direction.NORTH;
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

    public String executeCommand(String command) {

        if (command.equals("L")) {
            return turnLeft();
        } else if (command.equals("R")) {
            return turnRight();
        } else {
            return null;
        }
    }
}
