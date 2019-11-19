package practice.examples;

import java.util.*;

/**
 * Given an array of strings, group anagrams together
 * Example:
 *      Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 *      Output: [
 *                  ["ate","eat","tea"],
 *                  ["nat","tan"],
 *                  ["bat"]
 *              ]
 * Notes:
 *  All inputs will be in lowercase.
 *  The order of your output does not matter
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapping = new HashMap<>();
        for (String currentWord : strs) {
            char[] chars = currentWord.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!mapping.containsKey(sortedWord)) mapping.put(sortedWord, new ArrayList<String>());
            mapping.get(sortedWord).add(currentWord);
        }
        return new ArrayList<List<String>>(mapping.values());
    }
}
