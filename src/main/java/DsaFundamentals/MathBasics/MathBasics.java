package DsaFundamentals.MathBasics;

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

    // 6. - todo The formula for the array length is developed on the paper.
    private static int[] generateFibonacciNumbersUpToAGivenLimit(int limit) {
        int[] fibs = new int[];
    }
}
