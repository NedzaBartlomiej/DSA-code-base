package DsaFundamentals.ArrayBasics;

public class ArrayI {
    public static void main(String[] args) {
        // 1. (1.)
        System.out.println("1. ======");

        int[] arr1 = {1, 2, 3, 5, 6};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("n: " + arr1[i] + ", idx: " + i);
        }

        System.out.println("1. ======");


        // 2. (2.)
        System.out.println("2. ======");

        int[] arr2 = {1, 2, 3, 5, 6};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }

        System.out.println("2. ======");


        // 3. (3.)
        System.out.println("3. ======");

        int[] arr3 = {1, 2, 3, 5, 6};
        System.out.println("odd:");
        for (int j : arr3) {
            if (j % 2 != 0) System.out.println(j);
        }
        System.out.println("even:");
        for (int j : arr3) {
            if (j % 2 == 0) System.out.println(j);
        }

        System.out.println("3. ======");
    }
}
