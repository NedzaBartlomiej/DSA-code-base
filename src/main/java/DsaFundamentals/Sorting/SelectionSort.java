package DsaFundamentals.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 7, 2, 3};

        System.out.println(Arrays.toString(arr));

        // sort
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            if (i != min) {
                int tempIdxVal = arr[i];
                arr[i] = arr[min];
                arr[min] = tempIdxVal;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
