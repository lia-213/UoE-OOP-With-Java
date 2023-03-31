public class SquaresLoopRange {
    public static void main(String[] args) {

        int start = Integer.parseInt(args[0]);
        int stop = Integer.parseInt(args[1]);

        for(int i = start; i < (stop + 1); i++) {
            System.out.printf("%s ", i*i);
        }
    }
}
