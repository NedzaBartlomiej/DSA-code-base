package DsaFundamentals.StringBasics;

public class StringBasics {
    public static void main(String[] args) {
        // Print ASCII value of each character in a string.
        System.out.println("1.");

        String s = "text";
        for (char c : s.toCharArray()) {
            System.out.print((int) c + ",");
        }
        System.out.println();

        System.out.println("1.");


        // Count letters, numbers, and special characters in a string.
        System.out.println("2.");

        String s2 = "text12#34[]/f ^";
        int letters = 0, numbers = 0, specChars = 0;
        for (char c : s2.toCharArray()) {
            if (c >= 48 && c <= 57) numbers++;
            else if (c >= 97 && c <= 122 || c >= 97 - 32 && c <= 122 - 32) letters++;
            else specChars++;
        }
        System.out.println("letters = " + letters);
        System.out.println("numbers = " + numbers);
        System.out.println("specChars = " + specChars);

        System.out.println("2.");


        // Find the difference between the number of consonants and vowels.
        System.out.println("3.");

        String s3 = "aebcd";
        int vowels = 0;
        String vowelz = "AaEeIiOoUu";
        for (char c : s3.toCharArray()) {
            if (vowelz.indexOf(c) != -1) vowels++;
        }
        int consonants = s3.length() - vowels;
        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + consonants);
        System.out.println("diff = " + (Math.max(vowels, consonants) - Math.min(vowels, consonants)));

        System.out.println("3.");


        // Convert uppercase to lowercase and vice versa in a string.
        System.out.println("4.");

        String s4 = "AbcdSSSD/:";
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();

        for (char c : s4.toCharArray()) {
            if (c >= 97 - 32 && c <= 122 - 32) {
                char cLowerCase = (char) (c + 32);
                lowerCase.append(cLowerCase);
            } else lowerCase.append(c);
        }
        for (char c : s4.toCharArray()) {
            if (c >= 97 && c <= 122) {
                char cUpperCase = (char) (c - 32);
                upperCase.append(cUpperCase);
            } else upperCase.append(c);
        }
        System.out.println(lowerCase);
        System.out.println(upperCase);

        System.out.println();

        System.out.println("4.");
    }
}