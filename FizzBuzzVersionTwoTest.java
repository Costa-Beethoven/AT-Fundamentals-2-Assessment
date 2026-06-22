import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzVersionTwoTest {
    @Test
    void shouldReturn1WhenIndexEquals0() {
        // Arrange
        int index = 0;
        String expected = "1";

        // Act
        String[] output = FizzBuzzVersionTwo.FizzBuzz0to100();
        String actual = output[index];

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzWhenIndexEquals2() {
        // Arrange
        String[] output = FizzBuzzVersionTwo.FizzBuzz0to100();
        int index = 2;
        String expected = "Fizz";

        // Act
        String actual = output[index];

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnBuzzWhenIndexEquals4() {
        // Arrange
        String[] output = FizzBuzzVersionTwo.FizzBuzz0to100();
        int index = 4;
        String expected = "Buzz";

        // Act
        String actual = output[index];

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzBuzzWhenIndexEquals14() {
        // Arrange
        String[] output = FizzBuzzVersionTwo.FizzBuzz0to100();
        int index = 14;
        String expected = "FizzBuzz";

        // Act
        String actual = output[index];

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
