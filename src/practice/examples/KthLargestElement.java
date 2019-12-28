package practice.examples;

import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * Example: Input: [3,2,1,5,6,4] and k = 2; Output: 5
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4; Output: 4
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}
