import java.util.Scanner;

public class NMax {
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static double max(double a, double b, double c) { // overloading
        // methods w the same name, but diff parameter types; the compiler
        // will work out which version to call based on the types of the
        // supplied args
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        Scanner Ints = new Scanner(System.in);
        int a = Ints.nextInt();
        int b = Ints.nextInt();
        int c = Ints.nextInt();

    }
}
