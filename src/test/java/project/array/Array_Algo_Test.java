package project.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Algo_Test {

    @Test
    public void towSumTest(){

        Array_Algo array_algo1 = new Array_Algo();
//        //removed call to java/util/Arrays::sort → SURVIVED
//        int[] arr1 = {1,9,3,7,8};
//        Assertions.assertTrue(array_algo1.twoSum(arr1,9));
        int[] arr1 = {9,1,3,7,1};
        Assertions.assertTrue(array_algo1.twoSum(arr1,12));

        Array_Algo array_algo2 = new Array_Algo();
        int[] arr2 = {3,7,8,9,1};
        Assertions.assertTrue(array_algo2.twoSum(arr2,9));

        Array_Algo array_algo3 = new Array_Algo();
        int[] arr3 = {1,9,3,7,8};
        Assertions.assertFalse(array_algo3.twoSum(arr3,3));

        Array_Algo array_algo4 = new Array_Algo();
        int[] arr4 = {3,7,8,9,1};
        Assertions.assertFalse(array_algo4.twoSum(arr4,3));

//        //changed conditional boundary → SURVIVED
        Array_Algo array_algo5 = new Array_Algo();
        int[] arr5 = {5,2,3,4,5};
        Assertions.assertFalse(array_algo5.twoSum(arr5,4));

    }

    @Test
    public void majorityElementTest() {

        Array_Algo array_algo1 = new Array_Algo();
        int[] arr1 = {4, 1, 2, 6, 1, 1, 1};
        Assertions.assertEquals(array_algo1.majorityElement(arr1), 1);

        Array_Algo array_algo2 = new Array_Algo();
        int[] arr2 = {4, 1, 2, 6, 1, 7, 5};
        Assertions.assertEquals(array_algo2.majorityElement(arr2), -1);

        int[] arr3 = {3,1,3,3,2};
        Array_Algo array_algo3 = new Array_Algo();
        Assertions.assertEquals(array_algo3.majorityElement(arr3), 3);

//      //added because => 29. } else if (el == k) cnt++; (cnt++ to cnt-- SURVIVED)
        int[] arr4 = {3, 3, 4, 2, 3, 3, 3};
        Array_Algo array_algo4 = new Array_Algo();
        Assertions.assertEquals(array_algo4.majorityElement(arr4), 3);

        //added because => 38.  if (cnt1 > (n / 2)) return el; (changed conditional boundary → SURVIVED)
        int[] arr5 = {1,2,3,3};
        Array_Algo array_algo5 = new Array_Algo();
        Assertions.assertEquals(array_algo5.majorityElement(arr5), -1);
    }

    @Test
    public void maxSubarraySumTest() {

        Array_Algo array_algo1 = new Array_Algo();
        int[] arr1 = {4, -1, 2, 6, -1, 7, 5};
        Assertions.assertEquals(array_algo1.maxSubarraySum(arr1), 22);

        Array_Algo array_algo2 = new Array_Algo();
        int[] arr2 = {4, 1, 2};
        Assertions.assertEquals(array_algo2.maxSubarraySum(arr2), 7);

        Array_Algo array_algo3 = new Array_Algo();
        int[] arr3 = {-4, 1, 2};
        Assertions.assertEquals(array_algo3.maxSubarraySum(arr3), 3);

    }

    @Test
    public void maxProfitTest() {

        Array_Algo Array_algo = new Array_Algo();
        int[] arr = {10, 20, 40 ,50};
        Assertions.assertEquals(Array_algo.maxProfit(arr), 40);

    }

    @Test
    public void trappingRainWaterTest() {

        Array_Algo array_algo1 = new Array_Algo();
        int[] arr1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(array_algo1.trappingRainWater(arr1), 6);

        Array_Algo array_algo2 = new Array_Algo();
        int[] arr2 = {};
        Assertions.assertEquals(array_algo2.trappingRainWater(arr2), 0);

        Array_Algo array_algo3 = new Array_Algo();
        int[] arr3 = {0};
        Assertions.assertEquals(array_algo3.trappingRainWater(arr3), 0);

        Array_Algo array_algo4 = new Array_Algo();
        int[] arr4 = {0, 1, 0};
        Assertions.assertEquals(array_algo4.trappingRainWater(arr4), 0);

        Array_Algo array_algo5 = new Array_Algo();
        int[] arr5 = {1};
        Assertions.assertEquals(array_algo5.trappingRainWater(arr5), 0);

    }

    @Test
    public void getLongestSubarrayProblemTest() {

        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 9;
        Assertions.assertEquals(3, Array_Algo.getLongestSubarray(arr1, k1));

        int[] arr2 = {3, 4, 5, 6};
        int k2 = 20;
        Assertions.assertEquals(0, Array_Algo.getLongestSubarray(arr2, k2));

        int[] arr3 = {2, 2, 2, 2, 2};
        int k3 = 10;
        Assertions.assertEquals(5, Array_Algo.getLongestSubarray(arr3, k3));

        int[] arr4 = {4, -1, 2, 1};
        int k4 = 2;
        Assertions.assertEquals(3, Array_Algo.getLongestSubarray(arr4, k4));

        int[] arr5 = {0, 0, 0, 0};
        int k5 = 0;
        Assertions.assertEquals(4, Array_Algo.getLongestSubarray(arr5, k5));

        int[] arr6 = {5};
        int k6 = 5;
        Assertions.assertEquals(1, Array_Algo.getLongestSubarray(arr6, k6));

        int[] arr7 = {};
        int k7 = 10;
        Assertions.assertEquals(0, Array_Algo.getLongestSubarray(arr7, k7));

    }

    @Test
    public void getLongestSubarrayTest() {

        int[] arr1 = {4, 5, -2, 1, 2, 3, -6, 7};
        long k1 = 7;
        Assertions.assertEquals(0, Array_Algo.getLongestSubarray(arr1, k1));

        int[] arr2 = {2, -3, 2, -4, 2};
        long k2 = -1;
        Assertions.assertEquals(2, Array_Algo.getLongestSubarray(arr2, k2));

        int[] arr3 = {0};
        long k3 = 0;
        Assertions.assertEquals(1, Array_Algo.getLongestSubarray(arr3, k3));

        int[] arr4 = {-5};
        long k4 = 0;
        Assertions.assertEquals(0, Array_Algo.getLongestSubarray(arr4, k4));

        int[] arr5 = {1, 2, 3, 4, 5};
        long k5 = 12;
        Assertions.assertEquals(3, Array_Algo.getLongestSubarray(arr5, k5));

        int[] arr6 = {5, 4, 3, 2, 1};
        long k6 = 3;
        Assertions.assertEquals(2, Array_Algo.getLongestSubarray(arr6, k6));

        int[] arr7 = {5, 1, 2, 3};
        long k7 = 3;
        Assertions.assertEquals(2, Array_Algo.getLongestSubarray(arr7, k7));



    }

    @Test
    public void findUnionTest() {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        ArrayList<Integer> expected1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expected1.add(i);
        }
        Assertions.assertEquals(expected1, Array_Algo.FindUnion(arr1, arr2, arr1.length, arr2.length));

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {3, 4, 5, 6, 7};
        ArrayList<Integer> expected2 = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            expected2.add(i);
        }
        Assertions.assertEquals(expected2, Array_Algo.FindUnion(arr3, arr4, arr3.length, arr4.length));

        int[] arr5 = {1, 1, 1, 1, 1};
        int[] arr6 = {1, 1, 1, 1, 1};
        ArrayList<Integer> expected3 = new ArrayList<>();
        expected3.add(1);
        Assertions.assertEquals(expected3, Array_Algo.FindUnion(arr5, arr6, arr5.length, arr6.length));

        int[] arr7 = {};
        int[] arr8 = {};
        ArrayList<Integer> expected4 = new ArrayList<>();
        Assertions.assertEquals(expected4, Array_Algo.FindUnion(arr7, arr8, arr7.length, arr8.length));

        int[] arr9 = {-3, -2, -1};
        int[] arr10 = {-2, -1, 0};
        ArrayList<Integer> expected5 = new ArrayList<>();
        for (int i = -3; i <= 0; i++) {
            expected5.add(i);
        }
        Assertions.assertEquals(expected5, Array_Algo.FindUnion(arr9, arr10, arr9.length, arr10.length));

//      //Added because => 153 while (i < n && j < m) (j<m to j<=m : SURVIVED)
        int[] arr11 = {1, 3,5};
        int[] arr12 = {2, 4};
        ArrayList<Integer> expected6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(expected6, Array_Algo.FindUnion(arr11, arr12, arr11.length, arr12.length));

    }

    @Test
    public void missingNumberTest() {

        int[] arr1 = {2, 3, 4, 5, 6};
        int N1 = 6;
        Assertions.assertEquals(1, Array_Algo.missingNumber(arr1, N1));

        int[] arr2 = {};
        int N2 = 0;
        Assertions.assertEquals(-1, Array_Algo.missingNumber(arr2, N2));

    }

    @Test
    public void maxProductSubarrayTest() {

        int[] nums1 = {1,2,-3,0,-4,-5};
        Array_Algo array_algo1 = new Array_Algo();
        Assertions.assertEquals(array_algo1.maxProductSubArray(nums1), 20);

    }

    @Test
    public void majorityElementTestNBy3() {
        int[] arr3 = {11, 33, 22, 33, 11, 33, 11};
        Array_Algo array_algo3 = new Array_Algo();
        List<Integer> ans3 = array_algo3.majorityElementNBy3(arr3);
        Assertions.assertEquals(ans3, Arrays.asList(11, 33));
    }

    @Test
    public void repeatAndMissingTest() {

        int[] a1 = {3, 1, 2, 5, 4, 6, 7, 5};
        Array_Algo array_algo1 = new Array_Algo();
        int[] ans1 = array_algo1.findMissingRepeatingNumbers(a1);
        Assertions.assertEquals(ans1[0], 5);
        Assertions.assertEquals(ans1[1], 8);

    }
}
