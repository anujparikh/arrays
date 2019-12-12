package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class PowerOfThreeTest {
    @Test
    public void vanillaTest() {
        assertTrue(PowerOfThree.isPowerOfThree(9));
        assertTrue(PowerOfThree.isPowerOfThree(27));
        assertFalse(PowerOfThree.isPowerOfThree(18));
        assertFalse(PowerOfThree.isPowerOfThree(0));
        assertTrue(PowerOfThree.isPowerOfThree(1));
        assertFalse(PowerOfThree.isPowerOfThree(45));
    }
}
