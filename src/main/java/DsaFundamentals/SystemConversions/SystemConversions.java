package DsaFundamentals.SystemConversions;

public class SystemConversions {
    public static void main(String[] args) {

        System.out.println(decToBin(2));

        System.out.println(binToDec("10001"));

        System.out.println(decToOct(23));
    }

    private static String decToBin(int dec) {
        StringBuilder bin = new StringBuilder();
        while (dec != 0) {
            bin.insert(0, dec % 2);
            dec /= 2;
        }
        return bin.toString();
    }

    private static int binToDec(String bin) {
        int dec = 0;
        for (int i = bin.length() - 1, exponent = 0; i >= 0; i--, exponent++) {
            if (bin.charAt(i) != '1' && bin.charAt(i) != '0') throw new IllegalArgumentException();
            if (bin.charAt(i) == '1') dec += (int) Math.pow(2, exponent);
        }
        return dec;
    }

    private static int decToOct(int dec) {
        int oct = 0;
        int pos = 0;
        while (dec != 0) {
            oct += (int) (dec % 8 * Math.pow(10, pos));
            dec /= 8;
            pos++;
        }
        return oct;
    }

    /// ... others just the same formula
}
