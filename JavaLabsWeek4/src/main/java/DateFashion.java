public class DateFashion {

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) { // use if here not else if; also order
            // matters
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        int you = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        System.out.println(dateFashion(you, date));
    }

}
