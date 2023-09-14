import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random = new Random();
        int max = 0;
        int max_2 = 0;
        int max_7 = 0;
        int max_14 = 0;

        for (int number : numbers) {
            number = random.nextInt(10000);
            if (number > max) {
                max = number;
            }
            if ((number % 2 == 0) && (number > max_2)) {
                max_2 = number;
            }
            if ((number % 7 == 0) && (number > max_7)) {
                max_7 = number;
            }
            if ((number % 14 == 0) && (number > max_14)) {
                max_14 = number;
            }
        }
        int r = max * max_14;
        int r1 = max_2 * max_7;
        if (r == 0 && r1 == 0) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(r, r1));
        }
    }
}