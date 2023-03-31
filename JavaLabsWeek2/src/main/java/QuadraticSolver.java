public class QuadraticSolver {
    public static void main(String[] args) {
        double a, b, c;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        if ((Math.pow(b, 2) - 4*a*c) >= 0) {
            System.out.println((-b+Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
            System.out.println((-b-Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
        } else {
            System.out.println("error: imaginary solution");
        }
    }
}
