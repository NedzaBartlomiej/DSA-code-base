package DsaFundamentals.MathBasics;

import java.math.BigInteger;

public class WrittenArithmetic {
    public static void main(String[] args) {

        System.out.println(writtenAddition("186", "26"));

        System.out.println(writtenSubtraction("1", "2"));
    }

    // todo - written addition, written subtraction, written division,
    //  written multiplication (for integers) + (for doubles)\
    // todo - improve algorithms for signed numbers (-)

    private static String writtenAddition(String n1, String n2) {
        int n = n1.length() - 1;
        int m = n2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (n >= 0 || m >= 0 || carry > 0) {
            int n1Digit = n >= 0 ? n1.charAt(n) - '0' : 0;
            int n2Digit = m >= 0 ? n2.charAt(m) - '0' : 0;

            int sum = n1Digit + n2Digit + carry;
            result.append(sum % 10); // last digit of the sum

            carry = sum / 10;
            n--;
            m--;
        }
        return result.toString();
    }

    /**
     * function formula is n1 - n2;
     */
    private static String writtenSubtraction(String minuend, String subtrahend) {
        if (minuend.equals(subtrahend)) return "0";

        boolean negative = new BigInteger(minuend).compareTo(new BigInteger(subtrahend)) < 0;
        if (negative) {
            String minuendSave = minuend;
            minuend = subtrahend;
            subtrahend = minuendSave;
        }

        int minuendIdx = minuend.length() - 1;
        int subtrahendIdx = subtrahend.length() - 1;
        int loan = 0;
        StringBuilder result = new StringBuilder();

        while (minuendIdx >= 0 || subtrahendIdx >= 0 || loan > 0) {
            int minuendLastDigit = minuend.charAt(minuendIdx) - '0';
            int subtrahendLastDigit = subtrahendIdx >= 0 ? subtrahend.charAt(subtrahendIdx) - '0' : 0;

            minuendLastDigit -= loan;
            loan = 0;
            if (minuendLastDigit < subtrahendLastDigit) {
                minuendLastDigit += 10;
                loan = 1;
            }
            int difference = minuendLastDigit - subtrahendLastDigit;
            result.append(difference);

            minuendIdx--;
            subtrahendIdx--;
        }

        if (negative) result.append("-");
        result.reverse();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') result.deleteCharAt(i);
            else break;
        }

        return result.toString();
    }
}
