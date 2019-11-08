package practice.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 *  Input: nums = [2, 7, 11, 15], target = 9,
 *  Output: [0, 1]
 */
public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int balance = target - nums[i];
            if (inputMap.containsKey(balance)) {
                return new int[]{inputMap.get(balance), i};
            } else {
                inputMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
