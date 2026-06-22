public class BouncingBall {
    public static int occurrences(double h, double window) {
        double bounce = 0.66;
        int times = 0;

        if ((h <= 0) || (h < window)) {
            return -1;
        }

        while (h > window) {
            times++;
            h *= bounce;
        }

        return times;
    }

    static void main() {
        System.out.println("Times the brother will see the ball: "
                + occurrences(10, 1.5));
    }
}
