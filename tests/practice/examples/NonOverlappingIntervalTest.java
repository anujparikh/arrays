package practice.examples;

import org.junit.Assert;
import org.junit.Test;

public class NonOverlappingIntervalTest {

    @Test
    public void vanillaTest() {
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,3},{2,6},{8,17},{15,18}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,16},{2,6},{8,17},{15,18}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,4},{4,5}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,4},{0,4}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,4},{0,1}});
        new NonOverlappingInterval().eraseOverlapIntervals(new int[][]{{1,4},{0,2},{3,5}});
    }
}
