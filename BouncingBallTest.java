import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouncingBallTest {
    @Test
    public void givenHeightGreaterThanWindow_whenOccurrences_returnTimes() {
        // Arrange
        int h = 10;
        double window = 1.5;
        int expectedTimes = 5;

        //Act
        int actualTimes = BouncingBall.occurrences(h, window);

        // Assert
        assertEquals(expectedTimes, actualTimes);
    }

    @Test
    public void givenHeightLowerThanWindow_whenOccurrences_returnMinus1() {
        // Arrange
        int h = 1;
        double window = 1.5;
        int expectedTimes = -1;

        //Act
        int actualTimes = BouncingBall.occurrences(h, window);

        // Assert
        assertEquals(expectedTimes, actualTimes);
    }
}
