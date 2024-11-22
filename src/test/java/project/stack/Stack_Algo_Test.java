package project.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Stack_Algo_Test {

    @Test
    public void ngeTest() {
        int[] arr1 = {1, 5, 3, 4, 2};
        Stack_Algo stackAlgo1 = new Stack_Algo();
        int[] nges1 = stackAlgo1.nextGreaterElements(arr1);
        int[] ans1 = {5, -1, 4, -1, -1};
        boolean flag1 = true;
        for (int i = 0; i < ans1.length; i++) {
            if (nges1[i] != ans1[i]) {
                flag1 = false;
                break;
            }
        }
        Assertions.assertTrue(flag1);

        int[] arr2 = {};
        Stack_Algo stackAlgo2 = new Stack_Algo();
        int[] nges2 = stackAlgo2.nextGreaterElements(arr2);
        Assertions.assertEquals(0, nges2.length);

    }

    @Test
    public void asteroidCollisionTest() {
        int[] arr1 = {5,10,-5};
        Stack_Algo stackAlgo1 = new Stack_Algo();
        int[] ans1 = stackAlgo1.asteroidCollision(arr1);
        int[] expectedAns1 = {5,10};
        boolean flag1 = true;
        for (int i = 0; i < ans1.length; i++) {
            if (expectedAns1[i] != ans1[i]) {
                flag1 = false;
                break;
            }
        }
        Assertions.assertTrue(flag1);

        int[] arr2 = {8, -8};
        Stack_Algo stackAlgo2 = new Stack_Algo();
        int[] ans2 = stackAlgo2.asteroidCollision(arr2);
        Assertions.assertEquals(0, ans2.length);

        int[] arr3 = {10, 2, -5};
        Stack_Algo stackAlgo3 = new Stack_Algo();
        int[] ans3 = stackAlgo3.asteroidCollision(arr3);
        int[] expectedAns3 = {10};
        boolean flag3 = true;
        for (int i = 0; i < ans3.length; i++) {
            if (expectedAns3[i] != ans3[i]) {
                flag3 = false;
                break;
            }
        }
        Assertions.assertTrue(flag3);

        int[] arr4 = {-8, -8};
        Stack_Algo stackAlgo4 = new Stack_Algo();
        int[] ans4 = stackAlgo4.asteroidCollision(arr4);
        Assertions.assertEquals(2, ans4.length);

    }

    @Test
    public void subArrayRangesTest() {
        int[] arr1 = {1, 2, 3};
        Stack_Algo stackAlgo1 = new Stack_Algo();
        Assertions.assertEquals(stackAlgo1.subArrayRanges(arr1), 4);

        int[] arr2 = {1, 3, 3};
        Stack_Algo stackAlgo2 = new Stack_Algo();
        Assertions.assertEquals(stackAlgo2.subArrayRanges(arr2), 4);

        int[] arr3 = {4,-2,-3,4,1};
        Stack_Algo stackAlgo3 = new Stack_Algo();
        Assertions.assertEquals(stackAlgo3.subArrayRanges(arr3), 59);
    }

    @Test
    public void removeKDigitsTest() {
        Stack_Algo stackAlgo = new Stack_Algo();
        Assertions.assertEquals(stackAlgo.removeKDigits("1432219", 3), "1219");
        Assertions.assertEquals(stackAlgo.removeKDigits("10200", 1), "200");
        Assertions.assertEquals(stackAlgo.removeKDigits("10", 2), "0");
        Assertions.assertEquals(stackAlgo.removeKDigits("1211", 2), "11");
    }

    @Test
    public void largestHistogramTest() {
        Stack_Algo stackAlgo1 = new Stack_Algo();
        int[] arr1 = {2,1,5,6,2,3};
        Assertions.assertEquals(stackAlgo1.largestRectangleArea(arr1), 10);

        Stack_Algo stackAlgo2 = new Stack_Algo();
        int[] arr2 = {2,4};
        Assertions.assertEquals(stackAlgo2.largestRectangleArea(arr2), 4);

        Stack_Algo stackAlgo3 = new Stack_Algo();
        int[] arr3 = {};
        Assertions.assertEquals(stackAlgo3.largestRectangleArea(arr3), 0);

    }

}
