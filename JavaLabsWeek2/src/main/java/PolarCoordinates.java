public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double theta = Math.atan2(y, x);
        double Rmag = Math.sqrt(x*x + y*y);

        System.out.println(Rmag);
        System.out.println(theta);
    }
}
