package practice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 * Example:
 * Input: [[1,2],[2,3],[3,4],[1,3]]; Output: 1; Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
 * Input: [[1,2],[1,2],[1,2]]; Output: 2; Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
 * Input: [[1,2],[2,3]]; Output: 0; Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 */
public class NonOverlappingInterval {
    private class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[1], o2[1]);
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)  return 0;
        Arrays.sort(intervals, new IntervalComparator());
        int end = intervals[0][1];
        int count = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                count++;
            }
        }
        return intervals.length - count;
    }
}
