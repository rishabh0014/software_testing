package project.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Sorting_algo_Test {

    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Bubble_Sort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSort() {
        int[] arr = {12, 11, 13, 5, 6};
        int[] expected = {5, 6, 11, 12, 13};
        Insertion_Sort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSort() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        Selection_Sort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        Merge_Sort.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        Quick_Sort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
