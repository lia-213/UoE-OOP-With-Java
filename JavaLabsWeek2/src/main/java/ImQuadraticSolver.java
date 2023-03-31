public class ImQuadraticSolver {
    public static void main(String[] args) {

        double a, b, c, discriminant;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        discriminant = (Math.pow(b, 2) - 4*a*c);

        if ((2*a) != 0) {
            if (discriminant >= 0) {

                System.out.println((-b + (Math.sqrt(discriminant))) / (2 * a));
                System.out.println((-b - (Math.sqrt(discriminant))) / (2 * a));

            } else {

                double real = -b/(2*a);
                double im = (Math.sqrt(Math.abs(discriminant)))/(2*a);
                System.out.printf("%s + %si", real, im);
                System.out.println();
                System.out.printf("%s - %si", real, im);
            }}
        else {
            System.out.println(-c / b);
            }
        }
    }

