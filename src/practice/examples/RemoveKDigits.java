package practice.examples;

import java.util.Stack;

public class RemoveKDigits {
    public static String Solution(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peek() > num.charAt(i) && counter < k)
            {
                stack.pop();
                counter++;
            }
            stack.push(num.charAt(i));
        }

        while (counter < k) {
            stack.pop();
            counter++;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
