public class SaferDivider {
    public static void main(String[] args) {

        double num = Double.parseDouble(args[0]);
        double den = Double.parseDouble(args[1]);

        if (den == 0) {
            System.out.println("I can't divide by zero!");
        } else {
            System.out.println(num / den);
        }
    }
}
