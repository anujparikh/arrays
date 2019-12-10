package practice.examples;

import org.junit.Test;

public class MergeSortedArraysTest {

    @Test
    public void vanillaTest() {
        MergeSortedArrays.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,3,4}, 3);
        MergeSortedArrays.merge(new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3}, 3);
        MergeSortedArrays.merge(new int[]{1,4,5,0,0,0}, 3, new int[]{2,7,8}, 3);
    }

    @Test
    public void emptyTest() {
        MergeSortedArrays.merge(new int[]{1,2,3}, 3, new int[]{}, 0);
        MergeSortedArrays.merge(new int[]{0,0,0}, 0, new int[]{1,2,3}, 3);
    }
}
