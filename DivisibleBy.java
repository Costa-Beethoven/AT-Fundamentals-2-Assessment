import java.util.ArrayList;
import java.util.List;

public class DivisibleBy {

    static void main() {
        int maxNumber = 500;
        System.out.println("Total sum: " + totalSumDivisibleBy3And5(maxNumber));
    }

    public static int totalSumDivisibleBy3And5(int maxNumber) {
        int totalSum = 0;
        List<Integer> currentNumbers = new ArrayList<>();

        for (int i = 1; i <= maxNumber; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                currentNumbers.add(i);
                totalSum += i;
            }
        }

        System.out.println(currentNumbers);
        return totalSum;
    }
}
