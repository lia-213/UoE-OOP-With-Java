import java.util.Arrays;

public class Has271 {
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i + 1] == nums[i] + 5) && (nums[i + 2] == nums[i] - 1)) {
                return true;
            }
//        boolean success = false;
//        int[] testArray = new int[3];
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                testArray[j] = nums[j];
//            }
//            if (Arrays.toString(testArray) == "[2, 7, 1]") {
//                success = true;
//            }
//            // testArray[i] = nums[i];
//            // testArray[i+1] =
//        }
// /*           if (nums[i] == 2) { // && nums[i+1] == 7 && ) {
//                if (nums[i + 1] == 7) {
//                    if (nums[i + 2] == 1) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//
//  */
//        return success;
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[args.length];
//        for (int i = 0; i < args.length; i++) {
//            int newI = Integer.parseInt(args[i]);
//            array[i] += newI;
//        }
//        boolean check = has271(array);
//        System.out.println(check);
//    }
        }
        return false;
    }
}