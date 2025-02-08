package DsaFundamentals.ArrayBasics;

public class ArrayIII {
    public static void main(String[] args) {
        // 1. (7.)
        System.out.println("1. ======");

        int[] arr1 = {1, 1, 1, 2, 3, 5, 6};
        int target = 1;
        int seenCounter = 0;
        for (int n : arr1) {
            if (n == target) seenCounter++;
        }
        System.out.println("Target appears: " + seenCounter);

        System.out.println("1. ======");


        // 2. (8.)
        System.out.println("2. ======");

        int[] arr2 = {1, 2};
        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] < arr2[i + 1]) asc = true;
            else desc = true;
        }
        if (asc && desc) System.out.println("unsorted");
        else if (asc) System.out.println("asc");
        else System.out.println("desc");

        System.out.println("2. ======");


        // 3. (9.)
        System.out.println("3. ======");

        // f.e. only contains range: 1-100
        int[] arr3 = {1, 2, 3, 4, 4, 4, 4, 3, 3, 3, 5};
        int[] hashArr = new int[101];
        for (int j : arr3) {
            hashArr[j]++;
        }
        int duplicates = 0;
        for (int occurrences : hashArr) {
            if (occurrences > 1) duplicates += occurrences;
        }
        int uniques = arr3.length - duplicates;
        System.out.println("Arr3{duplicates: " + duplicates + ", uniques: " + uniques + "}");

        System.out.println("3. ======");
    }
}
