package DsaFundamentals.RecursionBasics;

public class RecursionBasics {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        printNTo1(5);

        System.out.println();

        print1ToN(5);

        System.out.println();

        System.out.println(findFibonacciNth(6));

        System.out.println(pow(2, 4));

        System.out.println(fastPow(2, 31));

        System.out.println(isPowerOfThree(28));

        System.out.println(calculateTheSumOfNumbersFrom1ToNUsingRecursion(3));

        printTheFibonacciSeriesUpToNTermsUsingRecursion(0, 1, 5);

        System.out.println();
        int[] arr = {1, 29889, 3, 4, 5, 697};
        printTheElementsOfAnArrayUsingRecursion(arr, arr.length - 1);

        System.out.println();
        System.out.println(countTheDigitsOfAGivenNumberUsingRecursion(13434, 0));

        System.out.println(findTheSumOfDigitsOfANumberUsingRecursion(345));

        System.out.println(findTheGcdOfTwoNumbersUsingRecursion(123, 24));

        System.out.println(findTheLargestElementOfAnArrayUsingRecursion(arr, arr.length - 1));

        System.out.println(reverseAStringUsingRecursion("String", new StringBuilder(), "String".length() - 1).toString());

        System.out.println(convertADecimalNumberToBinaryUsingRecursion(11, new StringBuilder()));

        System.out.println(isPrime(7, 2));

        printEvenNumbersInAGivenRangeUsingRecursion(-1, 7);

        System.out.println();
        System.out.println(isPalindrome("vabav", 0, "vabav".length() - 1));

        System.out.println(isSorted(new int[]{1, 2, 3}, 0));
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    private static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print("|" + n + "|");
        printNTo1(n - 1);
    }

    private static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n - 1);
        System.out.print("|" + n + "|");
    }

    private static int findFibonacciNth(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        else if (n <= 2) return 1;
        return findFibonacciNth(n - 1) + findFibonacciNth(n - 2);
    }

    private static int pow(int base, int exponent) {
        if (exponent == 1) return base;
        return base * pow(base, exponent - 1);
    }

    private static int fastPow(int base, int exponent) {
        if (exponent == 1) return base;
        int half = fastPow(base, exponent / 2);
        if (exponent % 2 == 0) return half * half;
        else return base * half * half;
    }

    private static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        else if (n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }

    private static int calculateTheSumOfNumbersFrom1ToNUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + calculateTheSumOfNumbersFrom1ToNUsingRecursion(n - 1);
    }

    private static void printTheFibonacciSeriesUpToNTermsUsingRecursion(int first, int sec, int n) {
        if (first + sec > n) return;
        System.out.print(first + sec + ";");
        printTheFibonacciSeriesUpToNTermsUsingRecursion(sec, first + sec, n);
    }

    private static void printTheElementsOfAnArrayUsingRecursion(int[] arr, int idx) {
        if (idx < 0) return;
        printTheElementsOfAnArrayUsingRecursion(arr, idx - 1);
        System.out.print(arr[idx] + ";");
    }

    // but I think the lvl approach is redundant, better way would be simply documentation,
    // which informs the client about case 0, and can be handled by the client.
    private static int countTheDigitsOfAGivenNumberUsingRecursion(int n, int lvl) {
        if (lvl == 0 && n == 0) return 1;
        if (n == 0) return 0;
        return 1 + countTheDigitsOfAGivenNumberUsingRecursion(n / 10, lvl + 1);
    }

    private static int findTheSumOfDigitsOfANumberUsingRecursion(int n) {
        if (n == 0) return 0;
        return n % 10 + findTheSumOfDigitsOfANumberUsingRecursion(n / 10);
    }

    private static int findTheGcdOfTwoNumbersUsingRecursion(int a, int b) {
        if (b == 0) return a;
        return findTheGcdOfTwoNumbersUsingRecursion(b, a % b);
    }

    private static int findTheLargestElementOfAnArrayUsingRecursion(int[] arr, int lastIdx) {
        if (lastIdx < 0) return Integer.MIN_VALUE;
        return Math.max(arr[lastIdx], findTheLargestElementOfAnArrayUsingRecursion(arr, lastIdx - 1));
    }

    private static StringBuilder reverseAStringUsingRecursion(String s, StringBuilder sb, int lastIdx) {
        if (lastIdx < 0) return sb;
        sb.append(s.charAt(lastIdx));
        return reverseAStringUsingRecursion(s, sb, lastIdx - 1);
    }

    private static StringBuilder convertADecimalNumberToBinaryUsingRecursion(int n, StringBuilder sb) {
        if (n == 0) return sb;
        return convertADecimalNumberToBinaryUsingRecursion(n / 2, sb.insert(0, n % 2));
    }

    private static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }

    private static void printEvenNumbersInAGivenRangeUsingRecursion(int start, int end) {
        if (start > end) return;
        if (start % 2 != 0) start++;
        System.out.print(start + ";");
        printEvenNumbersInAGivenRangeUsingRecursion(start + 2, end);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start == end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        else return isPalindrome(s, start + 1, end - 1);
    }

    private static boolean isSorted(int[] arr, int i) {
        if (arr.length <= 1) return true;
        if (i >= arr.length - 1) return true;
        if (arr[i] > arr[i + 1]) return false;
        return isSorted(arr, i + 1);
    }
}