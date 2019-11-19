package practice.examples;

import org.junit.Test;

public class GroupAnagramsTest {

    @Test
    public void vanillaTest() {
        GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        GroupAnagrams.groupAnagrams(new String[]{"asdf", "fdsa", "qwe", "zxcv", "yuiy", "fhjk"});
    }

    @Test
    public void emptyTest() {
        GroupAnagrams.groupAnagrams(new String[]{});
        GroupAnagrams.groupAnagrams(new String[]{"asdf"});
    }
}
