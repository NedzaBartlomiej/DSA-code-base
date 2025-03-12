package DsaFundamentals.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 1, 55, 32, 1, 54, 3};
        System.out.println(Arrays.toString(arr));

        // sort
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int sortedSideIdx = i;
            while (sortedSideIdx > 0 && arr[sortedSideIdx - 1] > curr) {
                arr[sortedSideIdx] = arr[sortedSideIdx - 1];
                sortedSideIdx--;
            }
            arr[sortedSideIdx] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }
}
