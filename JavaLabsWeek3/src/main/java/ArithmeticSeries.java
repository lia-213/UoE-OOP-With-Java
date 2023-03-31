public class ArithmeticSeries {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        int maxCount = Integer.parseInt(args[0]);
        while (count < maxCount) {
            ++count;
            sum += count;
        }
        System.out.println(sum);
    }
}
