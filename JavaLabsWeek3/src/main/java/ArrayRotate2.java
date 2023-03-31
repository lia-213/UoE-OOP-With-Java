public class ArrayRotate2 {

    public static void main(String[] args) {
        int n = args.length;
        int[] nums = new int[n];
        int[] copy = new int[n];

        // Loop 1 - read in arguments
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        // Loop 2 - copy array elements rotated
        for (int i = 0; i < (n - 1); i++) {
            copy[i] = nums[i + 1];
        }
        copy[n - 1] = nums[0];

        // Loop 3 - print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.print("\n");
    }
}