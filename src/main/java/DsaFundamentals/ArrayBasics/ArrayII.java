package DsaFundamentals.ArrayBasics;

import java.util.Arrays;

public class ArrayII {
    public static void main(String[] args) {

        // 1. (4.)
        System.out.println("1. ======");

        int[] arr1 = {1, 2, 3, 5, 6};
        int[] copy1 = new int[arr1.length];
        for (int i = 0; i < copy1.length; i++) {
            copy1[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(copy1));

        System.out.println("1. ======");


        // 2. (5.)
        System.out.println("2. ======");

        int[] arr2 = {1, 2, 3, 5, 6, 15, 22};
        int oddCounter = 0;
        int evenCounter = 0;
        for (int j : arr2) {
            if (j % 2 != 0) oddCounter++;
            else evenCounter++;
        }
        int[] odd = new int[oddCounter];
        int[] even = new int[evenCounter];

        for (int i = 0; oddCounter + evenCounter > 0; i++) {
            if (arr2[i] % 2 != 0) odd[--oddCounter] = arr2[i];
            else even[--evenCounter] = arr2[i];
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));

        System.out.println("2. ======");


        // 3. (6.)
        System.out.println("3. ======");

        int[] arr3 = {0, 1, 2, 3, 5, 6, 15, 22};
        int sum = 0;
        int product = 1;
        for (int n : arr3) {
            if (n == 0) continue;
            if (product >= Long.MAX_VALUE || sum >= Long.MAX_VALUE) break;
            sum += n;
            product *= n;
        }
        System.out.println("Prod = " + product + ", Sum = " + sum);

        System.out.println("3. ======");
    }
}
