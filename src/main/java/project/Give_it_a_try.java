package project;

import java.util.Arrays;

public class Give_it_a_try {
    public boolean twoSum(int []arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
