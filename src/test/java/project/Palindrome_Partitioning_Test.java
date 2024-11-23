package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Palindrome_Partitioning_Test {
    @Test
    public void testEmptyString() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(-1, palindromePartitioning.palindromePartitioning(""));
    }

    @Test
    public void testSingleCharacterString() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(0, palindromePartitioning.palindromePartitioning("a"));
    }

    @Test
    public void testAlreadyPalindromeString() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(0, palindromePartitioning.palindromePartitioning("aba"));
        assertEquals(0, palindromePartitioning.palindromePartitioning("aa"));
    }

    @Test
    public void testStringRequiringMultiplePartitions() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(1, palindromePartitioning.palindromePartitioning("aab"));
        assertEquals(1, palindromePartitioning.palindromePartitioning("aabb"));
    }

    @Test
    public void testComplexString() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(3, palindromePartitioning.palindromePartitioning("abcbaefg"));
    }

    @Test
    public void testPalindromeWithMixedCharacters() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(1, palindromePartitioning.palindromePartitioning("abacdc"));
    }

    @Test
    public void testAllUniqueCharacters() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(5, palindromePartitioning.palindromePartitioning("abcdef"));
    }

    @Test
    public void testStringWithRepeatingCharacters() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        assertEquals(0, palindromePartitioning.palindromePartitioning("aaaa"));
    }
}
