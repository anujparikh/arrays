package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void vanillaTest() {
        assertEquals(6, RemoveDuplicates.solution(new int[]{0,1,1,2,3,4,4,4,5}));
    }

    @Test
    public void emptyInputTest() {
        assertEquals(0, RemoveDuplicates.solution(new int[]{}));
    }

    @Test
    public void similarInputTest() {
        assertEquals(1, RemoveDuplicates.solution(new int[]{1,1,1,1,1,1,1,1,1,1}));
    }

    @Test
    public void allDifferentInputTest() {
        assertEquals(9, RemoveDuplicates.solution(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
