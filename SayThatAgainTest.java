import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayThatAgainTest {

    @Test
    void givenTheWordBrazil_whenRepeating_thenReturn3xWord() {
        // Arrange
        String word = "Brazil";
        String expectedRepeating = "BrazilBrazilBrazil";

        // Act
        String actualRepeating = SayThatAgain.repeating("Brazil");

        // Assert
        assertEquals(expectedRepeating, actualRepeating);
    }

    @Test
    void givenTheWordHello_whenRepeating_thenReturn3xWord() {
        // Arrange
        String word = "Hello";
        String expectedRepeating = "HelloHelloHello";

        // Act
        String actualRepeating = SayThatAgain.repeating("Hello");

        // Assert
        assertEquals(expectedRepeating, actualRepeating);
    }
}
