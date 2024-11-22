package project.bs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Binary_Search_Algo_Test {

    @Test
    public void binarySearchTests() {
        Binary_Search_Algo binary_Search_Algo = new Binary_Search_Algo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binary_Search_Algo.binarySearch(arr, 5), 2);
        Assertions.assertEquals(binary_Search_Algo.binarySearch(arr, 7), 3);
        Assertions.assertEquals(binary_Search_Algo.binarySearch(arr, 1), 0);
        Assertions.assertEquals(binary_Search_Algo.binarySearch(arr, 2), -1);
    }

    @Test
    public void lowerBoundTests() {
        Binary_Search_Algo binary_Search_Algo = new Binary_Search_Algo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binary_Search_Algo.lowerBound(arr, 4), 2);
        Assertions.assertEquals(binary_Search_Algo.lowerBound(arr, 6), 3);
        Assertions.assertEquals(binary_Search_Algo.lowerBound(arr, 1), 0);
        Assertions.assertEquals(binary_Search_Algo.lowerBound(arr, 7), 3);
    }

    @Test
    public void upperBoundTests() {
        Binary_Search_Algo binary_Search_Algo = new Binary_Search_Algo();
        int[] arr = {1, 3, 5, 7};
        Assertions.assertEquals(binary_Search_Algo.upperBound(arr, 4), 2);
        Assertions.assertEquals(binary_Search_Algo.upperBound(arr, 6), 3);
        Assertions.assertEquals(binary_Search_Algo.upperBound(arr, 1), 1);
        Assertions.assertEquals(binary_Search_Algo.upperBound(arr, 7), 4);
    }

    @Test
    public void peakElementTest() {

        Binary_Search_Algo binary_Search_Algo1 = new Binary_Search_Algo();
        int[] arr1 = {1, 3, 5, 2, 0};
        Assertions.assertEquals(binary_Search_Algo1.findPeakElement(arr1), 2);

        Binary_Search_Algo binary_Search_Algo2 = new Binary_Search_Algo();
        int[] arr2 = {1, 3, 4, 5, 2, 0};
        Assertions.assertEquals(binary_Search_Algo2.findPeakElement(arr2), 3);

        Binary_Search_Algo binary_Search_Algo3 = new Binary_Search_Algo();
        int[] arr3 = {};
        Assertions.assertEquals(binary_Search_Algo3.findPeakElement(arr3), -1);

        Binary_Search_Algo binary_Search_Algo4 = new Binary_Search_Algo();
        int[] arr4 = {1, 7, 5, 2, 0};
        Assertions.assertEquals(binary_Search_Algo4.findPeakElement(arr4), 1);

    }
}
