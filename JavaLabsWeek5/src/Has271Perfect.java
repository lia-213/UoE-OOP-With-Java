public class Has271Perfect {

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 5) && (nums[i + 2] == nums[i] - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = args.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(has271(nums));
    }
}
