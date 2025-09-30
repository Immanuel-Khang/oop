public class SumOfSines {
    public static void main(String[] args) {
        double degree = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degree);
        double result = Math.sin(2 * radians) + Math.sin(3 * radians);

        System.out.println(result);
    }
}
