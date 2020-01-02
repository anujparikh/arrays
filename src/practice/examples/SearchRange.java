package practice.examples;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 *
 * Example
 * Input: nums = [5,7,7,8,8,10], target = 8; Output: [3,4]
 * Input: nums = [5,7,7,8,8,10], target = 6; Output: [-1,-1]
 *
 * NOTE: Create solution using Binary search for achieving O(log n) time complexity
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int start = -1;
        int end = -1;
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) {
            return new int[]{-1, -1};
        }
        while (i <= j && nums[i] <= target && nums[j] >= target) {
            if (nums[i] == target && start == -1) {
                start = i;
            }
            if (nums[j] == target && end == -1) {
                end = j;
            }
            if (nums[i] == nums[j]) break;
            if (nums[i] != target) i++;
            if (nums[j] != target) j--;
        }
        return new int[]{start, end};
    }
}
