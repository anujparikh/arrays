package practice.examples;

/**
 * Given a sorted collection of intervals, merge all overlapping intervals.
 * Example:
 * Input: [[1,3],[2,6],[8,10],[15,18]]; Output: [[1,6],[8,10],[15,18]]
 * Input: [[1,4],[4,5]]; Output: [[1,5]]
 */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1 || intervals.length == 0) {
            return intervals;
        }
        int count = 0;
        int i = 0;
        int j = 1;
        while (j < intervals.length) {
            while (j < intervals.length && intervals[i][1] >= intervals[j][0]) {
                j++;
            }
            intervals[count][0] = Math.min(intervals[i][0], intervals[j - 1][0]);
            intervals[count][1] = Math.max(intervals[i][1], intervals[j - 1][1]);;
            count++;
            i = j;
            j = i + 1;
        }
        if (j == intervals.length) {
            intervals[count][0] = Math.min(intervals[i][0], intervals[j - 1][0]);
            intervals[count][1] = Math.max(intervals[i][1], intervals[j - 1][1]);;
            count++;
        }

        int[][] output = new int[count][2];
        for (int k = 0; k < output.length; k++) {
            output[k][0] = intervals[k][0];
            output[k][1] = intervals[k][1];
        }
        return output;
    }
}
