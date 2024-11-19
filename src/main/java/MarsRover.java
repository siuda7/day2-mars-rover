public class MarsRover {

    private String INITIAL_STATE = "0:0:N";

    private String direction;

    private String state;

    MarsRover() {
        this.direction = "N";
        this.state = INITIAL_STATE;
    }

    public String showStatus() {
        return state;
    }

    public String turnLeft() {
        if (direction.equals("N")) {
            direction = "W";
            return "0:0:" + direction;
        } else if (direction.equals("W")) {
            direction = "S";
            return "0:0:" + direction;
        } else if (direction.equals("S")){
            direction = "E";
            return "0:0:" + direction;
        } else if (direction.equals("E")) {
            direction = "N";
            return "0:0:" + direction;
        }
        return null;
    }

    public String turnRight() {
        if (direction.equals("N")) {
            direction = "E";
            return "0:0:" + direction;
        } else if (direction.equals("E")) {
            direction = "S";
            return "0:0:" + direction;
        } else if (direction.equals("S")) {
            direction = "W";
            return "0:0:" + direction;
        } else if (direction.equals("W")) {
            direction = "N";
            return "0:0:" + direction;
        }
        return null;
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
