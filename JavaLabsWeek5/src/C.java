public class C {
    public
    static void main(String strings[]) {
        int int1 = Integer.parseInt(strings[0]);
        int int2 = Integer.parseInt(strings[1]);
        if (int1 <= int2) {
            for
            (int index = int1;
             index <= int2;
             index++) {
                if (index % 2
                        == 0) {
                    System.out.print(index + " ");
                }
            }
        } else {
            System.out.println(int1 +
                    " cannot be greater than " + int2);
        }
    }
}