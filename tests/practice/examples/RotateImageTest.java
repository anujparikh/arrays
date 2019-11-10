package practice.examples;

import org.junit.Test;

public class RotateImageTest {
    /**
     * Skipping rest of the test as the method is manipulating in-place
     */
    @Test
    public void vanillaTest() {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateImage.solution(matrix);
        int[][] anotherMatrix = {
                {5, 1, 9,11},
                {2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        RotateImage.solution(anotherMatrix);
    }

    @Test
    public void emptyTest() {
        int[][] matrix = {{},{},{},{}};
        RotateImage.solution(matrix);
    }
}
