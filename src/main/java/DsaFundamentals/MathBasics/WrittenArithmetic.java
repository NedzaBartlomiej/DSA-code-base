package DsaFundamentals.MathBasics;

public class WrittenArithmetic {
    public static void main(String[] args) {

        System.out.println(writtenAddition("186", "26"));

    }

    // todo - written addition, written subtraction, written division,
    //  written multiplication (for integers) + (for doubles)

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
}
