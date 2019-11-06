package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SingleNumberTest {
    @Test
    public void vanillaTest() {
        assertEquals(3, SingleNumber.solution(new int[]{1,2,2,1,3}));
        assertEquals(5, SingleNumber.solution(new int[]{1,2,5,2,1,3,3,6,6}));
        assertEquals(3, SingleNumber.solution2(new int[]{1,2,2,1,3}));
        assertEquals(5, SingleNumber.solution2(new int[]{1,2,5,2,1,3,3,6,6}));
    }

    @Test
    public void emptyInputTest() {
        assertEquals(0, SingleNumber.solution(new int[]{}));
        assertEquals(0, SingleNumber.solution2(new int[]{}));
    }

    @Test
    public void negativeSenarioInputTest() {
        assertEquals(0, SingleNumber.solution(new int[]{1,1,2,2,3,3,4,4}));
        assertEquals(0, SingleNumber.solution2(new int[]{1,1,2,2,3,3,4,4}));
    }
}
