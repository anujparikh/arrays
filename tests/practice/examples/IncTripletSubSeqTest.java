package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IncTripletSubSeqTest {

    @Test
    public void vanillaTest() {
        assertTrue(IncTripletSubSeq.solution(new int[]{1,2,3,4,5}));
        assertFalse(IncTripletSubSeq.solution(new int[]{5,4,3,2,1}));
    }

    @Test
    public void emptyTest() {
        assertFalse(IncTripletSubSeq.solution(new int[]{}));
        assertFalse(IncTripletSubSeq.solution(new int[]{1,2}));
    }

    @Test
    public void otherTest() {
        assertFalse(IncTripletSubSeq.solution(new int[]{8,9,4,3,1,5}));
        assertTrue(IncTripletSubSeq.solution(new int[]{8,1,9,2,3,7}));
    }

    @Test
    public void negativeTest() {
        assertFalse(IncTripletSubSeq.solution(new int[]{0,4,2,1,0,-1,-3}));
        assertTrue(IncTripletSubSeq.solution(new int[]{0,4,2,1,0,-3,-2,-1}));
    }
}
