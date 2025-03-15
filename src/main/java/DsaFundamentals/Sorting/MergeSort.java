package DsaFundamentals.Sorting;

import java.util.Arrays;

public class MergeSort {
    private static int[] merged;

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        merged = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
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

    private static void iteratedMergeSort(int[] arr) {
        // todo 3/16/2025!
    }
}
