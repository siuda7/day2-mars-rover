public class MarsRover {

    private String initialState = "0:0:N";

    private String direction;

    private String state;

    MarsRover() {
        this.direction = "N";
        this.state = initialState;
    }

    public String showStatus() {
        return state;
    }

    public String left(){
        return null;
    }


    public String executeCommand(String command) {

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
}
