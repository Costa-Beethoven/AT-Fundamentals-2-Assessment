import java.util.Arrays;

public class FizzBuzzVersionTwo {

    public static String[] FizzBuzz0to100() {
        String resultString = "";
        String[] resultArray;

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                resultString = resultString + "FizzBuzz ";
            } else if (i % 3 == 0) {
                resultString = resultString + "Fizz ";
            } else if (i % 5 == 0) {
                resultString = resultString + "Buzz ";
            } else {
                resultString = resultString + i + " ";
            }
        }
        resultArray = resultString.trim().split(" ");
        return resultArray;
    }

    void main() {
        IO.println(Arrays.toString(FizzBuzz0to100()));
    }
}
