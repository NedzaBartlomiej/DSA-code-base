package DsaFundamentals.MathBasics;

import java.math.BigInteger;
import java.util.Arrays;

public class MathBasics {
    public static void main(String[] args) {
        int num = 145;
        // 1.
        System.out.println(findTheSumOfDigitsOfANumber(num));

        // 2.
        System.out.println(reverseAGivenNumber(num));

        // 3.
        System.out.println(checkIfANumberIsAPalindrome(121));

        // 4.
        System.out.println(checkIfANumberIsAnArmstrongNumber(153));

        // 5.
        System.out.println(countTheTotalOccurrencesOfTheDigit1InAllPositiveIntegersLessThanOrEqualToAGivenIntegerN(21));

        // 6.
        System.out.println(Arrays.toString(generateFibonacciNumbersUpToAGivenLimit(100000)));

        // 7.
        System.out.println(calculateTheFactorialOfANumber(4));

        // 8.
        System.out.println(findTheNumberOfTrailingZeroesInTheFactorialOfAGivenNumberN(25));

        // 9.
        calculateTheLcmAndGcdOfTwoNumbers(36, 27);

        // 10.
        System.out.println(checkIfANumberIsPrimeWithoutUsingTheSieveOfEratosthenes(8));

        // 11.
        System.out.println(checkIfTwoNumbersAreCoPrime(8, 15));

        // 12.
        findAllDivisorsOfAGivenNumber(8);
    }

    // 1.
    private static int findTheSumOfDigitsOfANumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 2.
    private static int reverseAGivenNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }
        return reversed;
    }

    // 3.
    private static boolean checkIfANumberIsAPalindrome(int n) {
        int nSave = n;
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }
        return reversed == nSave;
    }

    // 4.
    private static boolean checkIfANumberIsAnArmstrongNumber(int n) {
        int len = Integer.toString(n).length();
        int sum = 0;
        int nSave = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += (int) Math.pow(lastDigit, len);
            n /= 10;
        }
        return sum == nSave;
    }

    // 5. - todo optimization to O(logn)
    private static int countTheTotalOccurrencesOfTheDigit1InAllPositiveIntegersLessThanOrEqualToAGivenIntegerN(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int currN = i;
            while (currN > 0) {
                int lastDigit = currN % 10;
                if (lastDigit == 1) counter++;
                currN /= 10;
            }
        }
        return counter;
    }

    // 6.
    private static int[] generateFibonacciNumbersUpToAGivenLimit(int limit) {
        if (limit == 0) return new int[]{};
        double phi = (1 + Math.sqrt(5)) / 2;
        int fN = (int) Math.round(Math.log(limit * Math.sqrt(5)) / Math.log(phi));
        int[] fibs = new int[fN];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int i = 2; i < fibs.length; i++) {
            int currFib = fibs[i - 2] + fibs[i - 1];
            if (currFib <= limit) {
                fibs[i] = currFib;
            } else break;
        }
        return fibs;
    }

    // 7.
    private static BigInteger calculateTheFactorialOfANumber(int n) {
        if (n < 2) return BigInteger.ONE;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    // 8.
    private static int findTheNumberOfTrailingZeroesInTheFactorialOfAGivenNumberN(int n) {
        int counter = 0;
        while (n >= 5) {
            counter += n / 5;
            n /= 5;
        }
        return counter;
    }

    // 9.
    private static void calculateTheLcmAndGcdOfTwoNumbers(int n1, int n2) {
        // lcm by iteration
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        int divisor = max;
        while (max % min != 0) {
            max += divisor;
        }
        System.out.println("Iteration lcm = " + max);

        // gcd by iteration O(n)
        int min1 = Math.min(n1, n2);
        while (n1 % min1 != 0 || n2 % min1 != 0) {
            min1--;
        }
        System.out.println("Iteration gcd = " + min1);

        // gcd using subtraction euclides O(n) f.e: a = 100, b = 1;
        int a = n1, b = n2;
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        System.out.println("Euclides gcd = " + a);

        // gcd euclides modulo
        // maximized optimization - without possible one more loop iteration
        // (natural switching greater val to left by algorithm)
        int a1 = Math.max(n1, n2), b1 = Math.min(n1, n2);
        while (b1 != 0) {
            int tempA = a1;
            a1 = b1;
            b1 = tempA % b1;
        }
        System.out.println("modulo euclides gcd = " + a1);

        // lcm without iteration - with the gcd formula
        int lcm = n1 * n2 / a1; // a1 is just some NWD one of the above
        System.out.println("lcm with the gcd formula = " + lcm);
    }

    private static boolean checkIfANumberIsPrimeWithoutUsingTheSieveOfEratosthenes(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static boolean checkIfTwoNumbersAreCoPrime(int n1, int n2) {
        int a = Math.max(n1, n2), b = Math.min(n1, n2);
        while (b != 0) {
            int aSave = a;
            a = b;
            b = aSave % b;
        }
        return a == 1;
    }

    private static void findAllDivisorsOfAGivenNumber(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(",");
                if (i != n / i) System.out.print(n / i);
                System.out.print(",");
            }
        }
    }
}