package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_Algo_Test {
    @Test
    public void anagramTests() {
        String_Algo stringAlgo = new String_Algo();
        Assertions.assertTrue(stringAlgo.isAnagram("abc", "abc"));
        Assertions.assertTrue(stringAlgo.isAnagram("", ""));
        Assertions.assertFalse(stringAlgo.isAnagram("abc", "abd"));
        Assertions.assertFalse(stringAlgo.isAnagram("abc", ""));
    }

    @Test
    public void stringMatchTests() {
        String_Algo stringAlgo = new String_Algo();
        Assertions.assertTrue(stringAlgo.stringSearch("ABDHBHNHDKSSD", "DKSS"));
        Assertions.assertTrue(stringAlgo.stringSearch("", ""));
        Assertions.assertFalse(stringAlgo.stringSearch("", "DKSS"));
        Assertions.assertTrue(stringAlgo.stringSearch("ABDHBHNHDKSSD", ""));
        Assertions.assertFalse(stringAlgo.stringSearch("ABDHBHNHDKSSD", "DKSSA"));
    }

    @Test
    public void repeatedStringMatchBasicCaseTest() {
        String_Algo matcher = new String_Algo();
        String a = "abcd";
        String b = "cdabcdab";
        int expected = 3;

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchEmptyStringsTest() {
        String_Algo matcher = new String_Algo();
        String a = "";
        String b = "";
        int expected = -1;

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchOneEmptyStringTest() {
        String_Algo matcher = new String_Algo();
        String a = "abc";
        String b = "";
        int expected = -1;

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchNoMatchTest() {
        String_Algo matcher = new String_Algo();
        String a = "abcd";
        String b = "ef";
        int expected = -1;

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchRepeatedTest() {
        String_Algo matcher = new String_Algo();
        String a = "abc";
        String b = "abcabc";
        int expected = 2;

        int result = matcher.repeatedStringMatch(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchPositiveCaseTest() {
        String_Algo matcher = new String_Algo();
        String a = "abc";
        String b = "abcabcabcabc";

        int expected = 4;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchNegativeCaseTest() {
        String_Algo matcher = new String_Algo();
        String a = "xyz";
        String b = "abcd";

        int expected = -1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchSameStringsTest() {
        String_Algo matcher = new String_Algo();
        String a = "hello";
        String b = "hello";

        int expected = 1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatch_EmptyStringTest() {
        String_Algo matcher = new String_Algo();
        String a = "";
        String b = "test";

        int expected = -1;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void repeatedStringMatchBigStringsTest() {
        String_Algo matcher = new String_Algo();
        String a = "abc";
        String b = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";

        int expected = 19;
        int result = matcher.repeatedStringMatch(a, b);

        assertEquals(expected, result);
    }

}
