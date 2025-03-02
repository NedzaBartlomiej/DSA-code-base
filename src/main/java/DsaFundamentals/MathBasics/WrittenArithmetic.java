package DsaFundamentals.MathBasics;

import java.math.BigInteger;

public class WrittenArithmetic {
    public static void main(String[] args) {

        System.out.println(writtenAddition("-0000022", "-00342"));

        System.out.println(writtenSubtraction("034", "01"));

        System.out.println(writtenMultiplication("720", "7"));

        System.out.println(factorial("10"));
    }

    //  implementation for FLOAT

    private static String writtenAddition(String n1, String n2) {

        // cases handling/data preparation
        boolean negativeResult = false;
        BigInteger n1BI = new BigInteger(n1);
        BigInteger n2BI = new BigInteger(n2);
        String absSmaller = n1BI.min(n2BI).toString();
        String absLarger = n1BI.max(n2BI).toString();

        if (n1.charAt(0) == '-' && n2.charAt(0) == '-') {
            n1 = n1.substring(1);
            n2 = n2.substring(1);
            negativeResult = true;
        } else if (absSmaller.charAt(0) == '-') {
            absSmaller = absSmaller.substring(1);
            return writtenSubtraction(absLarger, absSmaller);
        }

        // addition
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

        // finishing the result
        if (negativeResult) result.append("-");
        result.reverse();
        for (int i = result.charAt(0) == '-' ? 1 : 0; i < result.length(); ) {
            if (result.charAt(i) == '0') result.deleteCharAt(i);
            else break;
        }

        return result.toString();
    }

    private static String writtenSubtraction(String minuend, String subtrahend) {
        if (minuend.equals(subtrahend)) return "0";

        // cases handling/data preparation
        if (minuend.charAt(0) == '-' && subtrahend.charAt(0) == '-') {
            minuend = minuend.substring(1);
            subtrahend = subtrahend.substring(1);
            String minuendSave = minuend;
            minuend = subtrahend;
            subtrahend = minuendSave;
        } else if (minuend.charAt(0) == '-') {
            subtrahend = "-" + subtrahend;
            return writtenAddition(minuend, subtrahend);
        } else if (subtrahend.charAt(0) == '-') {
            subtrahend = subtrahend.substring(1);
            return writtenAddition(minuend, subtrahend);
        }

        boolean negativeMinuend = new BigInteger(minuend).compareTo(new BigInteger(subtrahend)) < 0;
        if (negativeMinuend) {
            String minuendSave = minuend;
            minuend = subtrahend;
            subtrahend = minuendSave;
        }

        // subtraction
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

        // finishing the result
        if (negativeMinuend) result.append("-");
        result.reverse();
        for (int i = result.charAt(0) == '-' ? 1 : 0; i < result.length(); ) {
            if (result.charAt(i) == '0') result.deleteCharAt(i);
            else break;
        }

        return result.toString();
    }

    private static String writtenMultiplication(String n1, String n2) {
        if (n1.matches("0+") || n2.matches("0+")) return "0";

        // cases handling/data preparation
        boolean negative = false;
        if (n1.charAt(0) == '-' && n2.charAt(0) == '-') {
            n1 = n1.substring(1);
            n2 = n2.substring(1);
        } else if (n1.charAt(0) == '-') {
            n1 = n1.substring(1);
            negative = true;
        } else if (n2.charAt(0) == '-') {
            n2 = n2.substring(1);
            negative = true;
        }

        // multiplication
        int n1Len = n1.length();
        int n2Len = n2.length();
        int[] mplResult = new int[n1Len + n2Len]; // an array with the decimal positions of the result
        for (int i = n1Len - 1; i >= 0; i--) {
            int n1Digit = n1.charAt(i) - '0';
            for (int j = n2Len - 1; j >= 0; j--) {
                int n2Digit = n2.charAt(j) - '0';
                int currNumDecPos = i + j + 1; // curr decimal positions of the result
                int product = n1Digit * n2Digit + mplResult[currNumDecPos];
                mplResult[currNumDecPos] = product % 10; // set the curr decimal position result
                mplResult[currNumDecPos - 1] += product / 10; // update the next carry
            }
        }

        // finishing the result
        StringBuilder result = new StringBuilder();
        boolean numSeen = false;
        for (int n : mplResult) {
            if (n == 0 && !numSeen) continue;
            numSeen = true;
            result.append(n);
        }
        if (negative) result.insert(0, "-");

        return result.toString();
    }

    private static String factorial(String n) {
        long decimalPosition = (long) Math.pow(10, n.length() - 1);
        String factorial = "1";
        for (char digit : n.toCharArray()) {
            int numericDigit = digit - '0';
            for (int i = 2; i <= decimalPosition * numericDigit; i++) {
                factorial = writtenMultiplication(factorial, String.valueOf(i));
            }
            decimalPosition /= 10;
        }
        return factorial;
    }
}
