public class Dalek1ss {

    private double batteryCharge = 5;

    public void batteryReCharge(double c) {
        batteryCharge += c;
        System.out.println("Battery charge is: " + batteryCharge);
    }

    public void move(int distance) {
        int count = 1;
        int remainingDistance = distance;
        while (batteryCharge >= 0.5 && remainingDistance > 0) {
            System.out.print("[" + count + "] ");
            count++;
            batteryCharge -= 0.5;
            if (batteryCharge == 0) {
                System.out.print("Out of power!");
            }
            remainingDistance -= 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Dalek1ss d = new Dalek1ss(); // start off with a well-charged battery
        d.move(11); // move around and use up the charge
        d.batteryReCharge(2.5); // get a new charge
        d.batteryReCharge(0.5); // add a bit more
        d.move(5); // move some more
    }

}
