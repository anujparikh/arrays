package practice.examples;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example:
 *      Input: [0,1,0,3,12]
 *      Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public static void solution (int [] nums) {
        System.out.print("Input: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        for(int n = 0, p = n + 1; p < nums.length; ) {
            if (nums[n] == 0) {
                while (p < nums.length && nums[p] == 0) {
                    p++;
                }
                if (p < nums.length) {
                    int temp = nums[p];
                    nums[p] = nums[n];
                    nums[n] = temp;
                }
            }
            n++;
            p++;
        }
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n**********************************");
    }

    public static void solution2 (int [] nums) {
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[z++] = nums[i];
            }
        }
        for(int i = z; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
