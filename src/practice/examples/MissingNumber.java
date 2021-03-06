package practice.examples;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * Example:
 *  Input: [3,0,1] Output: 2
 *  Input: [9,6,4,2,3,5,7,0,1] Output: 8
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        boolean[] numsSeq = new boolean[nums.length + 1];
        for (int num : nums) {
            numsSeq[num] = true;
        }
        for (int i = 0; i < numsSeq.length; i++) {
            if (!numsSeq[i]) return i;
        }
        return -1;
    }
}
