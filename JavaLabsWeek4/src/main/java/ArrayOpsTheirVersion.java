import java.util.Arrays;

public class ArrayOpsTheirVersion {

    public static double findMax(double[] data) {
        double max = data[0];
        // Start for loop from the second array element here
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static void swap(double[] data1, double[] data2) {
        for (int i = 0; i < data1.length; i++) {
            double a = data1[i];
            data1[i] = data2[i];
            data2[i] = a;
        }
    }

    public static double[] normalise(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i] / sum;
        }
        return newData;
    }

    public static void normaliseInPlace(double data[]) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        for (int i = 0; i < data.length; i++) {
            data[i] /= sum;
        }
    }

    public static double[] reverse(double[] data) {
        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[data.length - 1 - i];
        }
        return newData;
    }

    public static void reverseInPlace(double[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            double tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        double[] d = { 1.0, 2.0, 3.0 };
        reverseInPlace(d);
        System.out.println(Arrays.toString(d));
    }

}
