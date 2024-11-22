package project.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Sorting_algo_Test {

    @Test
    public void bubbleSortTest() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Bubble_Sort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void insertionSortTest() {
        int[] arr = {12, 11, 13, 5, 6};
        int[] expected = {5, 6, 11, 12, 13};
        Insertion_Sort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void selectionSortTest() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        Selection_Sort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void mergeSortTest() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        Merge_Sort.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void quickSortTest() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void countingSortTest(){
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int[] expected = {1, 2, 2, 3, 3, 4, 8};
        Counting_Sort.countingSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void radixSortTest(){
        int[] arr = {3864, 2247, 4253, 553, 90, 822, 10010};
        int[] expected = {90, 553, 822, 2247, 3864, 4253, 10010};
        Radix_Sort.radixSort(arr);
        assertArrayEquals(expected, arr);
    }
}
