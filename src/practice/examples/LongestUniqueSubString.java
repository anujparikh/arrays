package practice.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters
 * Example:
 *      Input: "abcabcbb"; Output: 3 ("abc")
 *      Input: "bbbbbb"; Output: 1 ("b")
 *      Input: "pwwkew"; Output: 3 ("wke")
 */
public class LongestUniqueSubString {
    public static int solution (String s) {
        int result = 0;
        int startIndex = 0;
        int endIndex = 0;
        char[] chars = s.toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        while (endIndex < chars.length) {
            boolean isUnique = uniqueChars.add(chars[endIndex]);
            if (uniqueChars.size() > result) {
                result = uniqueChars.size();
            }
            if (!isUnique) {
                while (!(uniqueChars.add(chars[endIndex])) && startIndex <= endIndex) {
                    uniqueChars.remove(chars[startIndex]);
                    startIndex++;
                }
            }
            endIndex++;
        }
        return result;
    }
}
