package DsaFundamentals.ControlFlow;

import java.util.Arrays;

public class LoopsPractice1 {
    public static void main(String[] args) {
        // P1
        int num = 78979779;
        // calc last digit
        int lastDigit = num % 10;
        // calc first digit
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        // the sum
        System.out.println(firstDigit + lastDigit);

        // P2
        int num1 = 1234;
        // product digits
        int product = 1;
        while (num1 > 0) {
            int currDigit = num1 % 10; // get the last digit
            product *= currDigit; // product prev digits with the curr digit
            num1 /= 10; // remove the last digit f.e. 1234/10 = 123,4 -> Integer does not store digits after coma
        }
        System.out.println(product);

        // P3
        int num2 = 12121;
        // is num palindrome
        int notReversed = num2;
        int reversed = 0;
        while (num2 > 0) {
            int lastDigit1 = num2 % 10;
            reversed = reversed * 10 + lastDigit1;
            num2 /= 10;
        }
        System.out.println(notReversed == reversed);

        // P4
        int base = 2;
        int exponent = 5;
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= base;
        }
        System.out.println(power);

        // P5
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        System.out.println(Arrays.toString(fibonacci));

        // ||
        int n1 = 10;

        // start values
        int prevPrev = 1;
        int prev = 2;

        int curr;


        for (int i = 2; i < n1; i++) {
            curr = prevPrev + prev;
            prevPrev = prev;
            prev = curr;
            System.out.print(curr + ",");
        }
    }
}