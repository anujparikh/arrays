package practice.examples;

import org.junit.Test;

public class MoveZerosTest {
    @Test
    public void vanillaTest() {
        MoveZeros.solution(new int[]{0,1,0,3,12});
        MoveZeros.solution(new int[]{0,1,2,3,4,0,5});
    }

    @Test
    public void emptyTest() {
        MoveZeros.solution(new int[]{});
    }

    @Test
    public void negativeTest() {
        MoveZeros.solution(new int[]{1,2,3,4,5,6});
        MoveZeros.solution(new int[]{0,0,0,0});
    }

    @Test
    public void otherTest() {
        MoveZeros.solution(new int[]{4,2,4,0,0,3,0,5,1,0});
    }
}
