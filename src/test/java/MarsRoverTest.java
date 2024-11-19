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
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");

        // When
        String report = rover.executeCommand("L");

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_north_when_orient_west_and_turn_right() {

        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");

        // When
        String report = rover.executeCommand("R");

        // Then
        assertEquals("0:0:N", report);
    }
}
