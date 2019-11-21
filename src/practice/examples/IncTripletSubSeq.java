package practice.examples;

/**
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array
 * Formally the function should:
 *      Return true if there exists i, j, k
 *      such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 * Note: Your algorithm should run in O(n) time complexity and O(1) space complexity
 * Example:
 *  Input: [1,2,3,4,5] Output: true
 *  Input: [5,4,3,2,1] Output: false
 *  Input: [8,1,3,2,5] Output: true
 */
public class IncTripletSubSeq {
    public static boolean solution(int [] nums) {
        if (nums ==  null || nums.length < 3 ){
            return false;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] <= min){
                min = nums[i];
            }
            else if (nums[i] <= secondMin){
                secondMin = nums[i];
            }
            else {
                return true;
            }
        }
        return false;
    }
}
