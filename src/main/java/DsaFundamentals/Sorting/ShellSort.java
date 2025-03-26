package DsaFundamentals.Sorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 324, 23, 6, 45, 2, 32, 4, 5};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int currIns = arr[i];
                int sortedIdx = i;
                while (sortedIdx - gap >= 0 && arr[sortedIdx - gap] > currIns) {
                    arr[sortedIdx] = arr[sortedIdx - gap];
                    sortedIdx -= gap;
                }
                arr[sortedIdx] = currIns;
            }
        }
    }
}