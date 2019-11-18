package practice.examples;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * Note: The solution set must not contain duplicate triplets
 * Example:
 *  Input: [-1, 0, 1, 2, -1, -4]
 *  Output: [[-1, 0, 1], [-1, -1, 2]]
 */
public class ThreeSum {
    public static List<List<Integer>> solution(int[] nums) {
        // return null if the input array length is less than 3
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        // Sort the array
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        // Iteration till length - 2
        for (int i = 0; i < nums.length - 2; i++) {
            // as the array is sorted, and if the current number is more than 0, there are no more options
            if (nums[i] > 0) {
                break;
            }
            // to avoid duplicates, we just skip the case, if number and previous number are same
            if (i == 0 || nums[i] != nums[i - 1]) {

                //  simple two sums problem
                int startIndex = i + 1;
                int endIndex = nums.length - 1;
                int balance = 0 - nums[i];
                while (startIndex < endIndex) {
                    int sum = nums[startIndex] + nums[endIndex];
                    if (sum == balance) {
                        List<Integer> tuples = new ArrayList<>(Arrays.asList(nums[i], nums[startIndex], nums[endIndex]));
                        result.add(tuples);
                        while (startIndex < endIndex && nums[startIndex] == nums[startIndex + 1]) {
                            startIndex++;
                        }
                        while (startIndex < endIndex && nums[endIndex] == nums[endIndex - 1]) {
                            endIndex--;
                        }
                        startIndex++;
                        endIndex--;
                    } else if (sum > balance) {
                        endIndex--;
                    } else {
                        startIndex++;
                    }
                }
            }
        }
        return result;
    }
}
