package DsaFundamentals.ArrayBasics;

import java.util.Arrays;

public class ArrayAddons {
    public static void main(String[] args) {
        // Insert an element at the Xth position, shifting right.
        System.out.println("1.");

        // input
        int[] arr1 = {1, 2, 3, 43, 6452, 2};
        int idx = 5;
        int elm = 16;

        // func
        int[] resultArr1 = new int[arr1.length + 1];
        for (int i = 0; i < resultArr1.length; i++) {
            if (i < idx) {
                resultArr1[i] = arr1[i];
            } else if (i > idx) {
                resultArr1[i] = arr1[i - 1];
            } else {
                resultArr1[i] = elm;
            }
        }

        System.out.println(Arrays.toString(resultArr1));

        System.out.println("1.");

        // Delete an element at the Xth position, shifting left.
        System.out.println("2.");

        // input
        int[] arr2 = {1, 2, 3, 43, 6452, 2};
        int delIdx = 5;
        int[] resultArr2 = new int[arr2.length - 1];
        for (int i = 0; i < resultArr2.length; i++) {
            if (i < delIdx) {
                resultArr2[i] = arr2[i];
            } else {
                resultArr2[i] = arr2[i + 1];
            }
        }

        System.out.println(Arrays.toString(resultArr2));

        System.out.println("2.");
    }
}
