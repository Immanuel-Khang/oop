import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random random = new Random();
        int roll1 = random.nextInt(1, 7);
        int roll2 = random.nextInt(1, 7);
        System.out.println(roll1 + roll2);
    }
}
