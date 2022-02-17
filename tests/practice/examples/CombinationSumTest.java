package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CombinationSumTest {
    @Test
    public void vanillaTest() {
        assertEquals(4, CombinationSum.solution(new int[]{2,3,5}, 8));
    }
}
