package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Intersection2ArraysTest {
    @Test
    public void vanillaTest() {
        assertArrayEquals(new int[]{2,2}, Intersection2Arrays.solution(new int[]{1,2,2,1}, new int[]{2,2}));
        assertArrayEquals(new int[]{9,4}, Intersection2Arrays.solution(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    @Test
    public void emptyTest() {
        assertArrayEquals(new int[]{}, Intersection2Arrays.solution(new int[]{1,2,2,1}, new int[]{}));
        assertArrayEquals(new int[]{}, Intersection2Arrays.solution(new int[]{4,9,5}, new int[]{1,2,3}));
    }

    @Test
    public void duplicateTest() {
        assertArrayEquals(new int[]{1,1,1}, Intersection2Arrays.solution(new int[]{1,1,1,1,1}, new int[]{1,1,1}));
        assertArrayEquals(new int[]{2,2,4}, Intersection2Arrays.solution(new int[]{2,2,4}, new int[]{2,2,2,2,4,4,4}));
    }
}
