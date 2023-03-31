public class MeanVariance {
    public static void main(String[] args) {
        float n = args.length;
        float sum = 0;

        for (int i = 0; i < args.length; i++) {
            float toAdd = Float.parseFloat(args[i]);
            sum += toAdd;
        }

        float mean = sum/n;
        System.out.println(mean);

        double total = 0;
        for (int i = 0; i < args.length; i++) {
            double toAdd = Math.pow((Float.parseFloat(args[i]) - mean),2);
            total += toAdd;
        }
        double variance = total/n;
        System.out.println(variance);

    }

}
