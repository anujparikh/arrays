package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void vanillaTest() {
        assertEquals(6, MaximumSubarray.solution(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(1, MaximumSubarray.solution(new int[]{-2,1}));
        assertEquals(1, MaximumSubarray.solution(new int[]{1}));
        assertEquals(1, MaximumSubarray.solution(new int[]{-1,-1, -2, -3, -1, 1, -5}));
    }

    @Test
    public void negativeTest() {
        assertEquals(-1, MaximumSubarray.solution(new int[]{-1,-1, -2, -3, -5}));
    }

    @Test
    public void failedTest() {
        assertEquals(21, MaximumSubarray.solution(new int[]{8,-19,5,-4,20}));
    }
}
