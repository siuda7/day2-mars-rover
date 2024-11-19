public class MarsRover {

    private Direction direction = Direction.NORTH;

    private Integer xCoordinate = 0;

    private Integer yCoordinate = 0;

    MarsRover(Direction direction) {
        this.direction = direction;
    }

    MarsRover() {}

    public String showStatus() {
        return generateStatusString();
    }

    public String turnLeft() {
        switch (direction) {
            case NORTH -> direction = Direction.WEST;
            case WEST ->  direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.NORTH;
        }
        return generateStatusString();
    }

    public String turnRight() {
        switch (direction) {
            case NORTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.WEST;
            case WEST -> direction = Direction.NORTH;
        }
        return generateStatusString();
    }

    public String moveForward() {
        switch (direction) {
            case NORTH -> yCoordinate++;
            case EAST -> xCoordinate++;
            case SOUTH -> yCoordinate--;
            case WEST -> xCoordinate--;
        }
        return generateStatusString();
    }

    private String generateStatusString() {
        return String.format("%d:%d:%c", xCoordinate, yCoordinate, direction.getDirection());
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
