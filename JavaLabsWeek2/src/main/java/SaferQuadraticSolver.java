public class SaferQuadraticSolver {
    public static void main(String[] args) {

        double a, b, c, discriminantWITHOUTb;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        discriminantWITHOUTb = (Math.pow(b, 2) - 4*a*c);

        if (discriminantWITHOUTb >= 0) {

            if ((2*a) != 0) {
                System.out.println((-b + Math.sqrt(discriminantWITHOUTb)) / 2 * a);
                System.out.println((-b - Math.sqrt(discriminantWITHOUTb)) / 2 * a);
            }
            else {
                System.out.println("A = 0. Cannot solve equation.");
            }

        } else {

            System.out.println("Equation is not solvable for real x.");

        }
    }
}
