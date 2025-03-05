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
}