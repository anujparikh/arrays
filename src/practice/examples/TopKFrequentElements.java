package practice.examples;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * Example: Input: nums = [1,1,1,2,2,3], k = 2; Output: [1,2]
 * Input: nums = [1], k = 1; Output: [1]
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        for (int num : nums) {
            occurenceMap.put(num, occurenceMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> occurenceMap.get(n1) - occurenceMap.get(n2));
        for (int n : occurenceMap.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            output.add(heap.poll());
        }
        Collections.reverse(output);
        return output;
    }
}
