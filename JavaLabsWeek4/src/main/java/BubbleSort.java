import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        boolean swapMade = true;

        for (int i = 0; i < n-1 && swapMade; i++) {
            swapMade = false;

            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapMade = true;
                }
            }

            if (swapMade) {
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
