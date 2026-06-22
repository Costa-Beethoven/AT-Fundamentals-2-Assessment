import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByTest {

    @Test
    void givenMaxNumber7_whenTotalSumDivisibleBy3And5_thenReturnSum() {
        // Arrange
        int maxNumber = 7;
        int expectedSum = 14;

        // Act
        int actualSum = DivisibleBy.totalSumDivisibleBy3And5(maxNumber);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void givenMaxNumber500_whenTotalSumDivisibleBy3And5_thenReturnSum() {
        // Arrange
        int maxNumber = 500;
        int expectedSum = 58418;

        // Act
        int actualSum = DivisibleBy.totalSumDivisibleBy3And5(maxNumber);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}