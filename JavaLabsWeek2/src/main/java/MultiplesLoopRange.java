public class MultiplesLoopRange {
    public static void main(String[] args) {

        int start = Integer.parseInt(args[0]);
        int stop = Integer.parseInt(args[1]);
        int step = Integer.parseInt(args[2]);

        if (start <= stop) {
            for (int i = start; i < (stop + 1); i++) {
                if (i % step == 0) {
                    System.out.printf("%s ", i);
                } else {
                    continue;
                }
            }
        } else if (stop < start) {
            for (int i = start; i > (stop - 1); i--) {
                if (i % step == 0) {
                    System.out.printf("%s ", i);
                } else {
                    continue;
                }
            }
        }
    }}