package practice.examples;

public class MaximumSubarray {
    public static int solution(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
