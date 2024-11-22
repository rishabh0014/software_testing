package project.array;

import java.util.*;

public class Array_Algo {
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

    public int majorityElement(int[] v) {
        int n = v.length;
        int cnt = 0;
        int el = 0;

        for (int k : v) {
            if (cnt == 0) {
                cnt = 1;
                el = k;
            } else if (el == k) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for (int j : v) {
            if (j == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public long maxSubarraySum(int[] arr) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int n = arr.length;

        for (int j : arr) {

            sum += j;

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int j : arr) {
            minPrice = Math.min(minPrice, j);
            maxPro = Math.max(maxPro, j - minPrice);
        }
        return maxPro;
    }

    public int trappingRainWater(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }

    public static int getLongestSubarray(int []a, int k) {
        int n = a.length;

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {

            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;}


    public static int getLongestSubarray(int []a, long k) {
        int n = a.length;

        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }


    public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer > Union=new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j])
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n)
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m)
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }


    public static int missingNumber(int []a, int N) {

        for (int i = 1; i <= N; i++) {

            int flag = 0;

            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    public int maxProductSubArray(int[] arr) {
        int prod1 = arr[0], prod2 = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
            prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
            prod1 = temp;
            result = Math.max(result, prod1);
        }
        return result;
    }

    public List<Integer> majorityElementNBy3(int []v) {
        int n = v.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }
        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);
        return ls;
    }

    public int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }
        int number = (xr & ~(xr - 1));
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }
            else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            }
            else {
                zero = zero ^ i;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }
        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }
}
