package practice.examples;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {
    public static int solution(int[] input) {
        if (input.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < input.length; j++) {
            if (input[i] != input[j]) {
                i++;
                input[i] = input[j];
            }
        }
        return i + 1;
    }
}
