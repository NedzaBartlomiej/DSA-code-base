package DsaFundamentals.StringBasics;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

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


        // Remove leading, trailing, and extra spaces in a string.
        System.out.println("5.");
        stringBuilder.setLength(0);

        String s5 = " St ring ";

        for (char c : s5.toCharArray()) {
            if (c != 32) {
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);

        System.out.println("5.");


        // Find the maximum and minimum occurring characters in a string.
        System.out.println("6.");

        String s6 = "SSttriigg";
        int[] occurrencesByAscii = new int[128];
        for (char c : s6.toCharArray()) {
            occurrencesByAscii[c]++;
        }
        int maxOcc = 0, minOcc = Integer.MAX_VALUE;
        char maxChar = '\0', minChar = '\0';
        for (int i = 0; i < occurrencesByAscii.length; i++) {
            int currOcc = occurrencesByAscii[i];
            char currChar = (char) i;
            if (currOcc <= 0) continue;
            if (currOcc > maxOcc) {
                maxOcc = currOcc;
                maxChar = currChar;
            }
            if (currOcc < minOcc) {
                minOcc = currOcc;
                minChar = currChar;
            }
        }
        System.out.println("minChar = " + minChar);
        System.out.println("maxChar = " + maxChar);

        System.out.println("6.");


        // Check if there are two or three consecutive identical characters in a string.
        System.out.println("7.");

        String s7 = "=iiing";
        int streak = 1;
        for (int i = 1; i < s7.length(); i++) {
            if (s7.charAt(i) == s7.charAt(i - 1)) {
                streak++;
                continue;
            }
            if (streak == 2 || streak == 3) break;
            if (s7.charAt(i) != s7.charAt(i - 1)) streak = 1;
        }
        System.out.println(streak == 2 || streak == 3);

        System.out.println("7.");


        // Find the first and last index of occurrence for each character in a string.
        System.out.println("8.");
        String s8 = "abccba";
        int[] firstOcc = new int[128];
        int[] lastOcc = new int[128];
        Arrays.fill(firstOcc, s8.length());
        Arrays.fill(lastOcc, -1);

        for (int i = 0; i < s8.length(); i++) {
            if (i < firstOcc[s8.charAt(i)]) firstOcc[s8.charAt(i)] = i;
            if (i > lastOcc[s8.charAt(i)]) lastOcc[s8.charAt(i)] = i;
        }

        for (int i = 0; i < 128; i++) {
            if (firstOcc[i] == s8.length() && lastOcc[i] == -1) continue;
            System.out.println("char = " + (char) i + ", firstOcc = " + firstOcc[i] + ", lastOcc = " + lastOcc[i]);
        }

        System.out.println("8.");


        // Check if a string contains all letters from 'a' to 'z'.
        System.out.println("9.");

        String s9 = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(checkIfAStringContainsAllLettersFromAToZ(s9));
        System.out.println("9.");


        System.out.println(findASpecificSubstringWithinAString("strfyifyingi555", "555"));

        System.out.println(generateAllPossibleSubstringsOfAString("abc"));
    }

    // 9.
    private static boolean checkIfAStringContainsAllLettersFromAToZ(String s) {
        final short ALPHABET_LENGTH = 26;
        if (s.length() < ALPHABET_LENGTH) return false;
        Set<Character> letters = new HashSet<>(ALPHABET_LENGTH);
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(Character.toLowerCase(c));
            }
            if (letters.size() == ALPHABET_LENGTH) return true;
        }
        System.out.println(letters);
        return false;
    }

    // 10.
    // the function is compatible with the new String().substring(start, end) method.
    private static String findASpecificSubstringWithinAString(String s, String substring) {
        if (s.length() < substring.length()) return "The string does not contains the substring.";
        for (int i = 0, j = 0; i < s.length() && j < substring.length(); i++) {
            if (s.charAt(i) != substring.charAt(j)) j = 0;
            if (s.charAt(i) == substring.charAt(j)) j++;
            if (j == substring.length())
                return "The string contains substring at: {start:" + (i + 1 - substring.length()) + ", end:" + (i + 1) + "}";
        }
        return "The string does not contains the substring.";
    }

    // 11.
    // Using .substring(start, end) there are created new string for each substring -> so n^2 new strings,
    // Using StringBuilder
    // we have string only for each i iteration so n strings for generating substrings instead of n^2
    private static List<String> generateAllPossibleSubstringsOfAString(String s) {
        int n = s.length();
        List<String> substrings = new ArrayList<>(n * (n + 1) / 2);
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                substrings.add(sb.toString());
            }
        }
        return substrings;
    }
}