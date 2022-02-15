package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void vanillaTest() {
        assertEquals(2, SearchInsertPosition.solution(new int[]{1,3,5,6}, 5));
        assertEquals(1, SearchInsertPosition.solution(new int[]{1,3,5,6}, 2));
        assertEquals(4, SearchInsertPosition.solution(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void negativeValueTest() {
        assertEquals(6, SearchInsertPosition.solution(new int[]{-10,-7,-6,-4,2,3,5}, 4));
    }
}
