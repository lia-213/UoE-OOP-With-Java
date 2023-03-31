public class ArrayOps {
    public static double findMax(double[] data) {
        double maxNum = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maxNum) {
                maxNum = data[i];
            }
        }
        return maxNum;
    }

    public static double[] normalise(double data[]) {
        double sum = 0;
        // for (int i = 0; i < data.length; i++)
        for (double dataPoint : data){
            sum += dataPoint;
        }

        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i] / sum;
        }
        return newData;
    }

    public static void normaliseInPlace(double data[]) {
        double sum = 0;
        for (double dataPoint : data) {
            sum += dataPoint;
        }

        for (int i = 0; i < data.length; i++) {
            data[i] /= sum;
        }
    }

    public static double[] reverse(double[] data) {
        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[data.length - i - 1];
        }
        return newData;
    }

    public static void reverseInPlace(double[] data) { // when in place, use
        // a temporary variable!
        for (int i = 0; i < data.length/2; i++) { //split the array into 2
            // parts, so really swapping corresponding indeces
            double temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;

        }
    }

    public static void swap(double[] data1, double[] data2) {
        for (int i = 0; i < data1.length; i++) {
            double a  = data1[i];
            data1[i] = data2[i];
            data2[i] = a;
        }
    }
}
