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
            if (mapping.containsKey(sortedWord)) {
                mapping.computeIfPresent(sortedWord, (k, v) -> {
                    v.add(currentWord);
                    return v;
                });
            } else {
                mapping.computeIfAbsent(sortedWord, k -> {
                    List<String> list = new ArrayList<>();
                    list.add(currentWord);
                    return list;
                });
            }
        }
        List<List<String>> result = new ArrayList<>();
        mapping.forEach((k, v) -> result.add(v));
        return result;
    }
}
