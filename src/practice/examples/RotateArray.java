package practice.examples;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Example: Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    /**
     * Approach 1
     * create a temp array, directly copy number from the original array to correct
     * index on the temp array
     */
    public static void solution(int[] nums, int k) {
        if (nums.length != 0 && nums.length != 1) {
            if (k > nums.length) {
                k = k - nums.length;
            }
            int[] t = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int index = i + k;
                if (i + k > nums.length - 1) {
                    index = i + k - nums.length;
                }
                t[index] = nums[i];
            }
            System.arraycopy(t, 0, nums, 0, nums.length);
        }
    }
}
