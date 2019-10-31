package practice.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BuyAndSellStocksTest {
    @Test
    public void vanillaTest() {
        assertEquals(4, BuyAndSellStocks.solution(new int[]{1,2,3,4,5}));
    }

    @Test
    public void emptyInputTest() {
        assertEquals(0, BuyAndSellStocks.solution(new int[]{}));
        assertEquals(0, BuyAndSellStocks.solution(new int[]{0,0,0,0,0,0}));
        assertEquals(0, BuyAndSellStocks.solution(new int[]{1,1,1,1,1,1}));
    }

    @Test
    public void negativeInputTest() {
        assertEquals(0, BuyAndSellStocks.solution(new int[]{7,6,5,4,3,2,1}));
    }

    @Test
    public void randomInputTest() {
        assertEquals(7, BuyAndSellStocks.solution(new int[]{7,1,5,3,6,4}));
        assertEquals(3, BuyAndSellStocks.solution(new int[]{1,2,2,2,2,3,2,3}));
    }
}
