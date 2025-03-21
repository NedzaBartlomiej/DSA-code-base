package DsaFundamentals.Sorting;

import java.util.Arrays;

public class MergeSort {
    private static int[] merged;

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        merged = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println("Inversion count = " + iterativeMergeSort(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l == r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        // merge
        // grabbing the partly sorted main array
        System.arraycopy(arr, 0, merged, 0, arr.length);
        int i = l, j = mid + 1, curr = l;

        // partly-sorting on the main array basing on mergeArr
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

    private static int iterativeMergeSort(int[] arr) {
        int inversionCounter = 0;
        for (int mergeSize = 1; mergeSize < arr.length; mergeSize *= 2) {
            // sub-arrays merging
            for (int l = 0; l < arr.length - 1; l += 2 * mergeSize) {
                int mid = Math.min(l + mergeSize - 1, arr.length - 1);
                int r = Math.min(l + (mergeSize * 2) - 1, arr.length - 1);
                inversionCounter += merge(arr, l, mid, r);
            }
        }
        return inversionCounter;
    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int leftIterator = l;
        int rightIterator = mid + 1;
        int[] mergeArr = new int[r - l + 1];
        int mergeIterator = 0;
        int inversionCounter = 0;

        // merging
        while (leftIterator <= mid && rightIterator <= r) {
            if (arr[leftIterator] <= arr[rightIterator]) {
                mergeArr[mergeIterator] = arr[leftIterator++];
            } else {
                inversionCounter += mid - leftIterator + 1;
                mergeArr[mergeIterator] = arr[rightIterator++];
            }
            mergeIterator++;
        }
        // remaining elms
        while (leftIterator <= mid) {
            mergeArr[mergeIterator++] = arr[leftIterator++];
        }
        while (rightIterator <= r) {
            mergeArr[mergeIterator++] = arr[rightIterator++];
        }

        // updating the main array
        System.arraycopy(mergeArr, 0, arr, l, mergeArr.length);

        return inversionCounter;
    }
}
