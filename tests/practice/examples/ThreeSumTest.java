package practice.examples;

import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void vanillaTest() {
        ThreeSum.solution(new int[]{-1, 0, 1, 2, -1, 4});
        ThreeSum.solution(new int[]{0, 0, 0, 0, 0});
        ThreeSum.solution(new int[]{1,2,3,4,5,6,-7});
        ThreeSum.solution(new int[]{1,2,3,4,5,6});
        ThreeSum.solution(new int[]{});
    }
}
