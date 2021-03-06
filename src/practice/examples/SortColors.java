package practice.examples;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 * Example: Input: [2,0,2,1,1,0]; Output: [0,0,1,1,2,2]
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int pointer0 = 0;
        int pointer2 = nums.length - 1;
        for (int i = 0; i < nums.length && i <= pointer2;) {
            if (nums[i] == 1) {
                i++;
            } else if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[pointer0];
                nums[pointer0] = temp;
                pointer0++;
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[pointer2];
                nums[pointer2] = temp;
                pointer2--;
            }
        }
    }
}
