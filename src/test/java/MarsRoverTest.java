import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void should_initializa_mars_rover() {

        //Given
        MarsRover rover = new MarsRover();

        // When
        String report = rover.showStatus();

        // Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_west_when_orient_north_and_turn_left() {

        //Given
        MarsRover rover = new MarsRover();

        // When
        String report = rover.executeCommand("L");

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_east_when_orient_north_and_turn_right() {

        //Given
        MarsRover rover = new MarsRover();

        // When
        String report = rover.executeCommand("R");

        // Then
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_south_when_orient_west_and_turn_left() {

        //Given
        MarsRover rover = new MarsRover(Direction.WEST);

        // When
        String report = rover.executeCommand("L");

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_north_when_orient_west_and_turn_right() {

        //Given
        MarsRover rover = new MarsRover(Direction.WEST);

        // When
        String report = rover.executeCommand("R");

        // Then
        assertEquals("0:0:N", report);
    }

    @Test void should_south_when_orient_east_and_turn_right() {

        //Given
        MarsRover rover = new MarsRover(Direction.EAST);

        // When
        String report = rover.executeCommand("R");

        // Then
        assertEquals("0:0:S", report);
    }

    @Test void should_north_when_orient_east_and_turn_left() {

        //Given
        MarsRover rover = new MarsRover(Direction.EAST);

        // When
        String report = rover.executeCommand("L");

        // Then
        assertEquals("0:0:N", report);
    }

    @Test void should_east_when_orient_south_and_turn_left() {

        //Given
        MarsRover rover = new MarsRover(Direction.SOUTH);

        // When
        String report = rover.executeCommand("L");

        // Then
        assertEquals("0:0:E", report);
    }

    @Test void should_west_when_orient_south_and_turn_right() {

        //Given
        MarsRover rover = new MarsRover(Direction.SOUTH);

        // When
        String report = rover.executeCommand("R");

        // Then
        assertEquals("0:0:W", report);
    }

    @Test void should_01N_when_orient_north_and_move_forward() {

        //Given
        MarsRover rover = new MarsRover();

        // When
        String report = rover.executeCommand("M");

        // Then
        assertEquals("0:1:N", report);
    }

    @Test void should_0negative1S_when_orient_south_and_move_forward() {

        //Given
        MarsRover rover = new MarsRover(Direction.SOUTH);

        // When
        String report = rover.executeCommand("M");

        // Then
        assertEquals("0:-1:S", report);
    }

    @Test void should_1_0E_when_orient_east_and_move_forward() {

        //Given
        MarsRover rover = new MarsRover(Direction.EAST);

        // When
        String report = rover.executeCommand("M");

        // Then
        assertEquals("1:0:E", report);
    }

    @Test void should_negative1_0W_when_orient_west_and_move_forward() {

        //Given
        MarsRover rover = new MarsRover(Direction.WEST);

        // When
        String report = rover.executeCommand("M");

        // Then
        assertEquals("-1:0:W", report);
    }

    @Test void should_0negative1N_when_orient_north_and_move_backward() {
        //Given
        MarsRover rover = new MarsRover(Direction.NORTH);

        // When
        String report = rover.executeCommand("B");

        // Then
        assertEquals("0:-1:N", report);
    }


}
