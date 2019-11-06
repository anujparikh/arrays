package practice.examples;

import java.util.HashMap;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static int solution(int[] nums) {
        HashMap<Integer, Boolean> numsMap = new HashMap<>();
        for (int num : nums) {
            if (numsMap.containsKey(num)) {
                numsMap.put(num, true);
            } else {
                numsMap.put(num, false);
            }
        }
        for (int key: numsMap.keySet()) {
            if (!numsMap.get(key)) {
                return key;
            }
        }
        return 0;
    }

    /**
     * This particular case can be solved as XOR problem without using extra memory space
     */
    public static int solution2(int[] nums) {
        int result = 0;

        for(int number:nums)
            result ^= number;

        return result;
    }
}
