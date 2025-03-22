package DsaFundamentals.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // todo - translation for the text below
    // INSERTION-SORT OPTIMIZATION:
    // A good optimization for the MergeSort is also swap to InsertionSort for small arrays,
    // it will be faster than Divide and Conquer for a very small parts of an array.
    // F.e.
    // [4, 1, 3, 2, 5] -> InsertionSort approx.
    // Time complexity is ¬N, and QuickSort is going to ¬N^2!
    // If you sum a thousand arrays like that, QuickSort is so slow!
    // ^ Warto dodac, ze InsertionSort jest tutaj najlepszym wyborem,
    // poniewaz jego konkurenci, tacy jak BubbleSort czy SelectSort, maja stale O(n^2).

    // PIVOT OPTIMIZATION:
    // QuickSort jest bardzo niewydajny,
    // po prostu osiga swoje najgorsze zlozonosci,
    // w momencie gdy po prostu granica dzieli tablice na bardzo nierownomierne czesci,
    // czyli jest blisko konca lub, poczatku, dostajemy wtedy jedna,
    // bardzo mala czesc i druga praktycznie o tej samej dlugosci co wejsciowa tablica -
    // - logicznym jest ze to nie bedzie za kolorowy scenariusz,
    // wiec jezeli mamy losowe dane, no to losowy pivot jest najoptymalniejszym rozwiazaniem.
    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivot = (int) (l + Math.random() * (r - l + 1));
        swap(arr, r, pivot);
        int border = l;
        for (int i = l; i < r; i++) {
            if (arr[i] < arr[r]) {
                if (i != border) swap(arr, border, i);
                border++;
            }
        }
        swap(arr, border, r);
        quickSort(arr, l, border - 1);
        quickSort(arr, border + 1, r);
    }

    private static void iterativeQuickSort(int[] arr) {
        // Iterative QuickSort algorithm is based on the same idea.
        // You still need to use a stack
        // that will store successive arrays to be sorted created by correctly finding the boundary
        // these two ways, in many cases provide the same space complexity.
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
