public class CheckTrue {
    public static void main(String[] args) {
        boolean c1, c2, c3;
        c1 = false;
        c2 = true;
        if(c1)System.out.println("A");if(c2)System.out.println("B");else System.out.println("C");

        if (c1)
            System.out.println("A");
        if (c2)
            System.out.println("B");
        else
            System.out.println("C");


        if (c1) {
            System.out.println("A");
            if (c2)
                System.out.println("B");
            else
                System.out.println("C");
        }

        if (c1) System.out.println("A");
        if (c2) System.out.println("B");
        else System.out.println("C");

        if (c1) System.out.println("A");
        if (c2)
            System.out.println("B");
        else
            System.out.println("C");

        if (c1) {
            System.out.println("A");
        }
        if (c2)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
