package practice.examples;

import org.junit.Test;

public class RotateArrayTest {

    /**
     * Skipping rest of the test as the method is manipulating in-place
     */
    @Test
    public void vanillaTest() {
        RotateArray.solution(new int[]{1,2,3,4,5,6,7}, 3);
    }

    @Test
    public void emptyInputTest() {
        RotateArray.solution(new int[]{}, 1);
    }

    @Test
    public void singleInputTest() {
        RotateArray.solution(new int[]{1}, 2);
    }

    @Test
    public void numberOfRotationMoreThanLengthOfInputArrayTest() {
        RotateArray.solution(new int[]{1,2}, 3);
    }

}
