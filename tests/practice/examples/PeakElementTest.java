package practice.examples;

import org.junit.Assert;
import org.junit.Test;

public class PeakElementTest {

    @Test
    public void vanillaTest() {
        Assert.assertEquals(3, PeakElement.findPeakElement(new int[]{1,3,4,5,3}));
        Assert.assertEquals(0, PeakElement.findPeakElement(new int[]{1}));
    }
}
