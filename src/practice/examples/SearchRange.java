package practice.examples;

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
