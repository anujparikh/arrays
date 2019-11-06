package practice.examples;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ContainsDuplicateTest {
    @Test
    public void vanillaTest() {
        assertTrue(ContainsDuplicate.solution(new int[]{1, 2, 3, 4, 1}));
        assertFalse(ContainsDuplicate.solution(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void emptyInputTest() {
        assertFalse(ContainsDuplicate.solution(new int[]{}));
    }

    @Test
    public void randomInputsTest() {
        assertTrue(ContainsDuplicate.solution(new int[]{1,2,4,5,3,2,4,5,3,2,4,5,6,6,3,4,6,7,7,5}));
        assertFalse(ContainsDuplicate.solution(new int[]{1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-4,-5,-6}));
    }
}
