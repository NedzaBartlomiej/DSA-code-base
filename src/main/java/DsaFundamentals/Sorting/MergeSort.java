package DsaFundamentals.Sorting;

import java.util.Arrays;

public class MergeSort {
    private static int[] merged;

    public static void main(String[] args) {
        int[] arr = {3, 5, 435, 3, 1, 234, 45, 788, 7, 4, 324, 2, 9, 10};
        merged = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        iterativeMergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l == r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        // merge
        System.arraycopy(arr, 0, merged, 0, arr.length);
        int i = l, j = mid + 1, curr = l;
        while (i <= mid && j <= r) {
            if (merged[i] <= merged[j]) {
                arr[curr] = merged[i++];
            } else {
                arr[curr] = merged[j++];
            }
            curr++;
        }

        while (i <= mid) arr[curr++] = merged[i++];
    }

    private static void iterativeMergeSort(int[] arr) {
        for (int mergeSize = 1; mergeSize < arr.length; mergeSize *= 2) {
            // sub-arrays merging
            for (int l = 0; l < arr.length - 1; l += 2 * mergeSize) {
                int mid = l + mergeSize - 1;
                int r = Math.min(l + (mergeSize * 2) - 1, arr.length - 1);
                merge(arr, l, mid, r);
            }
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int[] mergeArr = new int[r - l + 1];
        int iterator = 0;

        // merging
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                mergeArr[iterator] = arr[i++];
            } else {
                mergeArr[iterator] = arr[j++];
            }
            iterator++;
        }
        // remaining elms
        while (i <= mid) mergeArr[iterator++] = arr[i++];
        while (j <= r) mergeArr[iterator++] = arr[j++];

        // updating the main array
        System.arraycopy(mergeArr, 0, arr, l, mergeArr.length);
    }
}
