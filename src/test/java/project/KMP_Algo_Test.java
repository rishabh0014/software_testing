package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KMP_Algo_Test {

    @Test
    public void testStrStr_WhenNeedleIsInHaystack_ReturnsCorrectIndex() {
        KMP_Algo kmp = new KMP_Algo();
        String haystack = "hello world";
        String needle = "world";
        int expectedIndex = 6;

        int result = kmp.strStr(haystack, needle);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testStrStr_WhenNeedleIsNotInHaystack_ReturnsMinusOne() {
        KMP_Algo kmp = new KMP_Algo();
        String haystack = "hello world";
        String needle = "universe";

        int result = kmp.strStr(haystack, needle);

        assertEquals(-1, result);
    }

    @Test
    public void testStrStr_WhenNeedleIsEmptyString_ReturnsZero() {

        KMP_Algo kmp = new KMP_Algo();
        String haystack = "hello world";
        String needle = "";

        int result = kmp.strStr(haystack, needle);

        assertEquals(0, result);
    }

    @Test
    public void testStrStr_WhenHaystackIsEmptyString_ReturnsMinusOne() {
        KMP_Algo kmp = new KMP_Algo();
        String haystack = "";
        String needle = "test";

        int result = kmp.strStr(haystack, needle);

        assertEquals(-1, result);
    }

    @Test
    public void testStrStr_WhenHaystackAndNeedleAreEmptyStrings_ReturnsZero() {
        KMP_Algo kmp = new KMP_Algo();
        String haystack = "";
        String needle = "";

        int result = kmp.strStr(haystack, needle);

        assertEquals(0, result);
    }

}
