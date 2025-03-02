package DsaFundamentals.RecursionBasics;

public class RecursionBasics {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        printNTo1(5);

        System.out.println();

        print1ToN(5);

        System.out.println();

        System.out.println(findFibonacciNth(6));
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
        if (n <= 2) return 1;
        return findFibonacciNth(n - 1) + findFibonacciNth(n - 2);
    }
}