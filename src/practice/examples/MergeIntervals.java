package practice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a sorted collection of intervals, merge all overlapping intervals.
 * Example:
 * Input: [[1,3],[2,6],[8,10],[15,18]]; Output: [[1,6],[8,10],[15,18]]
 * Input: [[1,4],[4,5]]; Output: [[1,5]]
 */
public class MergeIntervals {
    private static class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1 || intervals.length == 0) {
            return intervals;
        }
        List<int[]> output = new ArrayList<>();
        Arrays.sort(intervals, new IntervalComparator());
        for (int[] interval : intervals) {
            if (output.isEmpty() || output.get(output.size() - 1)[1] < interval[0]) {
                output.add(interval);
            } else {
                output.set(output.size() - 1, new int[]{output.get(output.size() - 1)[0], Math.max(output.get(output.size() - 1)[1], interval[1])});
            }
        }
        int[][] finalOutput = new int[output.size()][2];
        for (int i = 0; i < output.size(); i++) {
            finalOutput[i] = output.get(i);
        }
        return finalOutput;
    }
}
