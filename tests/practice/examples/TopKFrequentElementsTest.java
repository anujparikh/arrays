package practice.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElementsTest {

    @Test
    public void vanillaTest() {
        List<Integer> result = TopKFrequentElements.topKFrequent(new int[]{2,2,2,2,1,1,3,3,3,3,3}, 2);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,2));
        Assert.assertEquals(expected, result);
    }
}
