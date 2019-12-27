package practice.examples;

import org.junit.Test;

public class SortColorsTest {

    @Test
    public void vanillaTest() {
        SortColors.sortColors(new int[]{2,0, 1});
    }
}

/*
[2,0,2,1,1,0]
[2,0,2,1,1,1]
[1,1,1,1,1,1]
[2,2,2,2,0,0,0]
[1,2]
[]
[0,0,0,0]
[2,0,1]
[2,2]
[2,0,2]
 */