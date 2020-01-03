package practice.examples;

import org.junit.Test;

public class MergeIntervalsTest {

    @Test
    public void vanillaTest() {
//        new MergeIntervals().merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        new MergeIntervals().merge(new int[][]{{1,3},{2,6},{8,17},{15,18}});
        new MergeIntervals().merge(new int[][]{{1,16},{2,6},{8,17},{15,18}});
        new MergeIntervals().merge(new int[][]{{1,4},{4,5}});
        new MergeIntervals().merge(new int[][]{{1,4},{0,4}});
        new MergeIntervals().merge(new int[][]{{1,4},{0,1}});
        new MergeIntervals().merge(new int[][]{{1,4},{0,2},{3,5}});
    }

}
