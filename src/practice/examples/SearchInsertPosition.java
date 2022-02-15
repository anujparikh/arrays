package practice.examples;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {
    public static int solution(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        for (; nums[i] <= target && nums[j] >= target; i++, j--) {
            if (nums[i] == target) {
                return i;
            } else if (nums[j] == target) {
                return j;
            }
        }
        return nums[i] > target ? i : j + 1;
    }
}
