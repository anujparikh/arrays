package practice.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static boolean solution(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                return true;
            }
        }
        return false;
    }
}
