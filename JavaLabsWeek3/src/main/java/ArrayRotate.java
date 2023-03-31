public class ArrayRotate {
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        int[] copyNums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int argument = Integer.parseInt(args[i]);
            nums[i] = copyNums[i] = argument;
        }

        int tmp = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            // int intI = Integer.parseInt(args[i]);
            copyNums[i-1] = nums[i-1];
            nums[i] = copyNums[i-1]; //incorrect output!!
            // System.out.println(nums[i]);
        }
        nums[0] = tmp;
        // for (int i = 0; i < nums.length)
        System.out.println(java.util.Arrays.toString(nums));
    }
}
