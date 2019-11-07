package practice.examples;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
    public static int[] solution(int[] digits) {
        if (digits.length == 0 || (digits.length == 1 && digits[0] == 0)) {
            return new int[]{1};
        }
        boolean increment = false;
        for(int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
                increment = true;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i <= digits.length; i++) {
            result[i] = 0;
        }
        return result;
    }
}
