package practice.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveKDigitsTest {
    @Test
    public void vanillaTest() {
        assertEquals("1219", RemoveKDigits.Solution("1432219", 3));
    }
}
