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
        switch (direction) {
            case "N" -> {
                direction = "W";
                return "0:0:" + direction;
            }
            case "W" -> {
                direction = "S";
                return "0:0:" + direction;
            }
            case "S" -> {
                direction = "E";
                return "0:0:" + direction;
            }
            case "E" -> {
                direction = "N";
                return "0:0:" + direction;
            }
            default -> {
                return null;
            }
        }
    }

    public String turnRight() {
        switch (direction) {
            case "N" -> {
                direction = "E";
                return "0:0:" + direction;
            }
            case "E" -> {
                direction = "S";
                return "0:0:" + direction;
            }
            case "S" -> {
                direction = "W";
                return "0:0:" + direction;
            }
            case "W" -> {
                direction = "N";
                return "0:0:" + direction;
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
            return null;
        }
    }
}
