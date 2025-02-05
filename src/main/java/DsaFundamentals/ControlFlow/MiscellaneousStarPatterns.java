package DsaFundamentals.ControlFlow;

public class MiscellaneousStarPatterns {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int n1 = 5;
        int spaces1 = n1 - 1;
        int stars1 = 1;
        for (int i = 0; i < n1 * 2 - 1; i++) {
            /// just spaces1/stars1 print
            for (int j = 0; j < spaces1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars1; j++) {
                System.out.print("*");
            }
            System.out.println();
            ///  spaces1/stars1 count control-panel for the particular row
            if (i < n1 - 1) {
                spaces1--;
                stars1 += 2;
            } else {
                spaces1++;
                stars1 -= 2;
            }
        }

        System.out.println("P1 ======");


        // P2
        System.out.println("P2 ======");

        int n2 = 5;
        int stars2 = n2;
        int spaces2 = 0;
        for (int i = 0; i < n2 * 2 - 1; i++) {
            for (int j = 0; j < spaces2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars2; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n2 - 1) {
                spaces2 += 2;
                stars2--;
            } else {
                spaces2 -= 2;
                stars2++;
            }

        }

        System.out.println("P2 ======");


        // P3
        System.out.println("P3 ======");

        int n3 = 5;
        for (int i = 0; i < n3 * 2 - 1; i++) {
            for (int j = 0; j < n3 - 1; j++) {
                if (i != n3 - 1) System.out.print(" ");
            }
            for (int j = 0, count = 1; j < count; j++) {
                if (i == n3 - 1) count = n3 * 2 - 1;
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int n4 = 5;
        int rightBase = n4 * 2 - 1;
        int leftBase = 0;
        for (int i = 0; i < n4 * 2 - 1; i++) {
            for (int j = 0; j < rightBase; j++) {
                if (j == leftBase || j == rightBase - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < n4 - 1) {
                rightBase--;
                leftBase++;
            } else {
                rightBase++;
                leftBase--;
            }
        }

        System.out.println("P4 ======");


        // P5
        System.out.println("P5 ======");

        int n5 = 5;
        for (int i = 0; i < n5 * 2 - 1; i++) {
            for (int j = 0; j < n5; j++) {
                if ((i == 0 && (j == 0 || j == n5 - 1)) ||
                        (i == n5 - 1 && (j == 0 || j == n5 - 1)) ||
                        (i == (n5 - 1) * 2 && (j == 0 || j == n5 - 1))
                ) {
                    System.out.print(" ");
                } else if (i == 0 || i == n5 - 1 || i == (n5 - 1) * 2 ||
                        j == 0 || j == n5 - 1
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("P5 ======");
    }
}