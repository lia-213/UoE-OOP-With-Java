import java.util.Scanner;

public class IsTriangular {
    public static boolean isTri(double a, double b, double c) {
        if (a < (b+c) || b < (a+c) || c < (a+b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double a = stdIn.nextDouble();
        double b = stdIn.nextDouble();
        double c = stdIn.nextDouble();

        if (isTri(a, b, c)) { // immediately checking if true!!
            System.out.printf("%s, %s and %s could be the lengths of a " +
                    "triangle\n", a, b, c);
        } else {
            System.out.println("Not a triangle.");
        }
        stdIn.close(); // good coding practice to close data streams after
        // you no longer need them, so call it at the end of the program!!
    }
}
