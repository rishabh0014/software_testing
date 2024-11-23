package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sliding_Window_Algo_Test {

    @Test
    public void longestSSTest() {
        Sliding_Window_Algo slidingWindowAlgo1 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo1.longestSSWithNoRepeatingCharacters("ABCABCD"), 3);
        Assertions.assertEquals(slidingWindowAlgo1.longestSSWithNoRepeatingCharacters("ABCD"), 4);
        Assertions.assertEquals(slidingWindowAlgo1.longestSSWithNoRepeatingCharacters("AAAAA"), 1);
        Assertions.assertEquals(slidingWindowAlgo1.longestSSWithNoRepeatingCharacters("A"), 1);
        Assertions.assertEquals(slidingWindowAlgo1.longestSSWithNoRepeatingCharacters(""), 0);
    }

    @Test
    public void longestConsecutiveOnes() {
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        Sliding_Window_Algo slidingWindowAlgo1 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo1.longestOnes(nums1, k1), 6);

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        Sliding_Window_Algo slidingWindowAlgo2 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo2.longestOnes(nums2, k2), 10);

        int[] nums3 = {};
        int k3 = 3;
        Sliding_Window_Algo slidingWindowAlgo3 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo3.longestOnes(nums3, k3), 0);

    }

    @Test
    public void characterReplacement() {
        String s1 = "ABAB";
        int k1 = 2;
        Sliding_Window_Algo slidingWindowAlgo1 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo1.characterReplacement(s1, k1), 3);

        String s2 = "AABABBA";
        int k2 = 1;
        Sliding_Window_Algo slidingWindowAlgo2 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo2.characterReplacement(s2, k2), 2);

        String s3 = "";
        int k3 = 1;
        Sliding_Window_Algo slidingWindowAlgo3 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo3.characterReplacement(s3, k3), 0);
    }

    @Test
    public void noOfSubArrays() {
        String s1 = "abcabc";
        Sliding_Window_Algo slidingWindowAlgo1 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo1.numberOfSubstrings(s1), 10);

        String s2 = "aaacb";
        Sliding_Window_Algo slidingWindowAlgo2 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo2.numberOfSubstrings(s2), 3);

        String s3 = "";
        Sliding_Window_Algo slidingWindowAlgo3 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo3.numberOfSubstrings(s3), 0);

        String s4 = "abc";
        Sliding_Window_Algo slidingWindowAlgo4 = new Sliding_Window_Algo();
        Assertions.assertEquals(slidingWindowAlgo4.numberOfSubstrings(s4), 1);
    }
}
