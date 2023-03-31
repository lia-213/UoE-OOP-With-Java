public class JavaChecking {
//    public static void main(String[] args) {
//        int count = 0;
//        while (count++ < 3);
//        System.out.println("Square of " + count + " is " + (count * 2));
//    }
public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
        System.out.println("Square of " + i + " is " + (i * 2));
    }

    int i = 0;
    do {
        System.out.println("Square of " + i + " is " + (i * 2));
        i++; // increment at end
    } while (i < 3);

    int j = 0;
    while (j < 3) {
        System.out.println("Square of " + j + " is " + (j * 2));
        i++; // increment at end
    }
}
}
