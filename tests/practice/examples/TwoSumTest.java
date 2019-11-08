package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void vanillaTest() {
        assertArrayEquals(new int[]{1,3}, TwoSum.solution(new int[]{1,2,3,4,5}, 6));
        assertArrayEquals(new int[]{0,1}, TwoSum.solution(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void emptyTest() {
        assertArrayEquals(new int[]{}, TwoSum.solution(new int[]{}, 0));
    }
}
