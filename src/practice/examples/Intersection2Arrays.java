package practice.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 *      1)  Input: nums1 = [1,2,2,1], nums2 = [2,2]
 *          Output: [2,2]
 *      2)  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 *          Output: [4,9]
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 */

/**
 * Follow up Questions:
 * Q: What if the given array is already sorted? How would you optimize your algorithm?
 * A: Classic two pointer iteration, i points to nums1 and j points to nums2.
 *      Because a sorted array is in ascending order, so if nums1[i] > nums[j],
 *      we need to increment j, and vice versa. Only when nums1[i] == nums[j],
 *      we add it to the result array. Time Complexity O(max(N, M)).
 */
public class Intersection2Arrays {
    public static int[] solution(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        int [] smaller = nums1.length >= nums2.length ? nums2 : nums1;
        int [] bigger = nums1.length < nums2.length ? nums2 : nums1;
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int value : smaller) {
            occurrenceMap.put(value, occurrenceMap.computeIfAbsent(value, k -> 0) + 1);
        }
        int i = 0;
        for (int value : bigger) {
            int occurred = occurrenceMap.getOrDefault(value, 0);
            if (occurred != 0) {
                smaller[i] = value;
                occurrenceMap.put(value, occurrenceMap.get(value) - 1);
                i++;
            }
        }
        return Arrays.copyOfRange(smaller, 0, i);
    }
}