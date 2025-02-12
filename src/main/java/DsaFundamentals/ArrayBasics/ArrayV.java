package DsaFundamentals.ArrayBasics;

public class ArrayV {
    public static void main(String[] args) {
        // 1.
        System.out.println("1. ======");

        int[] arr1 = {3, 7, 11, 22};
        int min = Integer.MAX_VALUE;
        for (int n : arr1) {
            if (n < min) min = n;
        }
        System.out.println(min);

        System.out.println("1. ======");


        // 2.
        System.out.println("2. ======");

        int[] arr2 = {12, 12, 2, 3};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int n : arr2) {
            if (n > max) {
                secMax = max;
                max = n;
            } else if (n > secMax && n < max) {
                secMax = n;
            }
        }
        if (secMax == Integer.MIN_VALUE) System.out.println(-1);
        else System.out.println(secMax);

        System.out.println("2. ======");


        // 3.
        System.out.println("3. ======");

        int[] arr3 = {12, 4, 4, 8};
        int min1 = Integer.MAX_VALUE;
        int secMin1 = Integer.MAX_VALUE;
        for (int n : arr3) {
            if (n < min1) {
                secMin1 = min1;
                min1 = n;
            } else if (n < secMin1 && n > min1) {
                secMin1 = n;
            }
        }
        if (secMin1 == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(secMin1);

        System.out.println("3. ======");
    }
}
