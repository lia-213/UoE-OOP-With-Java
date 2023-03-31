public class NoTriples {
    public static boolean noTriples(int[] nums) {
        // if there is a triple, return false; else true
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                return false;
            }
        }


        return true;
    }
}
