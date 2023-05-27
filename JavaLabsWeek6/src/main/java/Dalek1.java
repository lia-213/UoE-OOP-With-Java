import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Dalek1 {
    private double batteryCharge = 5.0;
    public void batteryReCharge(double c) {
        batteryCharge += c;
        System.out.printf("Battery charge is now: %.2f%n%n", batteryCharge);
    }
    public void move(int distance) {

        int distanceMoved;
        for (distanceMoved = 0; distanceMoved < distance; distanceMoved++) {
            if (batteryCharge >= 0.5) {
                batteryCharge -= 0.5;
                System.out.printf("Distance Moved: [%d]; ", distanceMoved + 1);
                System.out.printf("Battery Charge: %.2f %n", batteryCharge);
            } else {
                break;
            }
        }
        System.out.printf("Total distance moved before battery died: %2d%n%n", distanceMoved);
    }

    private String[] sayings = {};

    public void setSayings(String[] u2) { this.sayings = u2; }

    public void speak() {
        String utterance;
        if (sayings.length > 0) {
            System.out.println(sayings[(int) (Math.random() * this.sayings.length)]);
        } else {
            System.out.println("No utterances installed!");
        }
    }

    public static void main(String[] args) {

        Dalek1 d = new Dalek1();
        Dalek1 d2 = new Dalek1();

        d.move(12);
        d.batteryReCharge(2.5);
        d.batteryReCharge(0.5);
        d.move(5);

        String[] u2 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d2.setSayings(u2);

        System.out.println("\nDalek d2 says: ");
        for (int i = 0; i < 10; i++) {
            d2.speak();
        }

        System.out.println("\nDalek d3 says: ");
        Dalek1 d3 = new Dalek1();
        String[] u3 = { "I obey!" };
        d3.setSayings(u3);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }

    }
}
