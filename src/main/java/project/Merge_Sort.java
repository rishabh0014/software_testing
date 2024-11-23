package project;

public class Merge_Sort {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            Merge.merge(arr, l, m, r);
        }
    }

}
