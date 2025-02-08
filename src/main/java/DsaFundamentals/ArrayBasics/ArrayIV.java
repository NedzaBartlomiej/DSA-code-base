package DsaFundamentals.ArrayBasics;

import java.util.HashSet;

public class ArrayIV {
    public static void main(String[] args) {
        // 1. (10.) (Two-Sum - optimized cus I can do it, and I understand it)
        System.out.println("1. ======");

        int[] arr1 = {3, 7, 11, 22};
        int target = 9;
        boolean hasTarget = false;
        HashSet<Integer> targetDifferences = new HashSet<>(arr1.length);
        for (int j : arr1) {
            if (targetDifferences.contains(j)) {
                hasTarget = true;
                break;
            }
            targetDifferences.add(target - j);
        }
        System.out.println(hasTarget);

        System.out.println("1. ======");

        // 2. (11.) (Three-Sum - unoptimized - I'll do it later, when I will improve my skill - sequent learning)
        System.out.println("2. ======");

        int[] arr2 = {3, 3, 11, 33};
        int target2 = 9;
        boolean hasTarget2 = false;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                for (int k = j + 1; k < arr2.length; k++) {
                    if (arr2[i] + arr2[j] + arr2[k] == target2) {
                        hasTarget2 = true;
                        break;
                    }
                }
            }
        }
        System.out.println(hasTarget2);

        System.out.println("2. ======");


        // 3. (12.)
        System.out.println("3. ======");

        int[] arr3 = {3, 3, 111, 33};
        int max = Integer.MIN_VALUE;
        for (int n : arr3) {
            if (n > max) max = n;
        }
        System.out.println(max);

        System.out.println("3. ======");
    }
}
