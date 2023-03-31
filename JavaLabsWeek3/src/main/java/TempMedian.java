import java.util.Arrays;
public class TempMedian {
    public static void main(String[] args) {
        int[] tempArray = new int[args.length];
        tempArray[0] = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            if (args[i] == "+") {
                tempArray[i] = tempArray[0] + 1;
            } else if (args[i] == "-") {
                tempArray[i] = tempArray[0] - 1;
            } else if (args[i] == "."){
                tempArray[i] = tempArray[0];
            } else {
                throw new IllegalArgumentException("You should have entered a" +
                        " +, -, or .");
            }

            System.out.println(Arrays.toString(tempArray));
            Arrays.sort(tempArray);

            for (int j = 0; j < tempArray.length; j++) {
                System.out.print(tempArray[i] + " ");
            }

            float median = 0;
            if (tempArray.length % 2 == 0) {
                median =
                        (tempArray[(tempArray.length)/2 - 1] + tempArray[tempArray.length/2])/2;
            } else {
                median = tempArray[tempArray.length/2];
            }
            System.out.println(median);




        }
    }
}

//public class TempMedian {
//    public static void main(String[] args) {
//        int n = args.length;
//        int[] dataset = new int[n];
//
//        // Work out temperature array
//        dataset[0] = Integer.parseInt(args[0]);
//
//        for (int i = 1; i < n; i++) {
//            String c = args[i];
//            if (c.equals(".")) {
//                dataset[i] = dataset[i - 1];
//            }
//            if (c.equals("+")) {
//                dataset[i] = dataset[i - 1] + 1;
//            }
//            if (c.equals("-")) {
//                dataset[i] = dataset[i - 1] - 1;
//            }
//        }
//
//        // Print out raw temp data:
//        System.out.print(dataset[0]);
//        for (int i = 1; i < n; i++) {
//            System.out.print(" " + dataset[i]);
//        }
//        System.out.print("\n");
//
//        // Sort the data:
//        Arrays.sort(dataset);
//
//        // Print out sorted temp data:
//        System.out.print(dataset[0]);
//        for (int i = 1; i < n; i++) {
//            System.out.print(" " + dataset[i]);
//        }
//        System.out.print("\n");
//
//        // Find the median:
//        double median;
//
//        if (dataset.length % 2 == 1) {
//            // Array has odd number of elements
//            median = dataset[(n + 1) / 2 - 1];
//        } else {
//            // Array has even number of elements
//            median = (dataset[n / 2] + dataset[n / 2 - 1]) / 2.0;
//        }
//
//        System.out.println(median);
//
//    }
//}