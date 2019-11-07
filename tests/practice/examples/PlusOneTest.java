package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    @Test
    public void vanillaTest() {
        assertArrayEquals(new int[]{1,2,4}, PlusOne.solution(new int[]{1,2,3}));
        assertArrayEquals(new int[]{2}, PlusOne.solution(new int[]{1}));
        assertArrayEquals(new int[]{1,0}, PlusOne.solution(new int[]{9}));
    }

    @Test
    public void emptyTest() {
        assertArrayEquals(new int[]{1}, PlusOne.solution(new int[]{}));
    }

    @Test
    public void extremeTest() {
        assertArrayEquals(new int[]{1,0,0,0,0}, PlusOne.solution(new int[]{9,9,9,9}));
        assertArrayEquals(new int[]{2,0,0,0}, PlusOne.solution(new int[]{1,9,9,9}));
        assertArrayEquals(new int[]{1}, PlusOne.solution(new int[]{0}));
    }
}
