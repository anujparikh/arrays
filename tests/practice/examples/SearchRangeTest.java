package practice.examples;

import org.junit.Assert;
import org.junit.Test;

public class SearchRangeTest {

    @Test
    public void vanillaTest() {
        Assert.assertArrayEquals(new int[]{1,4}, SearchRange.searchRange(new int[]{0,2,2,2,2,3,4,5,6}, 2));
        Assert.assertArrayEquals(new int[]{2,2}, SearchRange.searchRange(new int[]{0,1,2,3,3,3,4,5,6}, 2));
        Assert.assertArrayEquals(new int[]{-1,-1}, SearchRange.searchRange(new int[]{0,1,2,3,3,3,4,5,6}, 8));
        Assert.assertArrayEquals(new int[]{-1,-1}, SearchRange.searchRange(new int[]{}, 8));
        Assert.assertArrayEquals(new int[]{0,0}, SearchRange.searchRange(new int[]{1}, 1));
    }
}
