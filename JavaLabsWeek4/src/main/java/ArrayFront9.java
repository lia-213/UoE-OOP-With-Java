public class ArrayFront9 {
    public static boolean arrayFront9 (int[] nums) {
        boolean isTrue = false;
        for (int i = 0; i < 4 && i < nums.length; i++) { // saying i < nums
            // .length as well bc doesn't need to be 4 long, can be shorter
            if (nums[i] == 9) {
                isTrue = true;
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
       boolean checkArray = arrayFront9(nums);
        if (checkArray == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
