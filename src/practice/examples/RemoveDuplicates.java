package practice.examples;

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
