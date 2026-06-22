public class SayThatAgain {

    static String repeating(String word) {
        int times = 3;
        return word.repeat(times);
    }

    static void main(String[] args) {
        String word = "hello";
        System.out.println(repeating(word));
    }
}
