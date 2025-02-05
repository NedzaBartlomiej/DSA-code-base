package DsaFundamentals.ControlFlow;

public class SquareStarAndRhombusStarPatterns {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int n1 = 5;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P1 ======");


        // P2
        System.out.println("P2 ======");

        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == 0 || i == n2 - 1) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j == n2 - 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("P2 ======");


        // P3
        System.out.println("P3 ======");

        int n3 = 5;
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                // upper/bottom base
                if (i == 0 || i == n3 - 1) {
                    System.out.print("*");
                    continue;
                }
                // side bases
                if (j == 0 || j == n3 - 1) {
                    System.out.print("*");
                    continue;
                }
                // center
                if (i == n3 / 2 && j == n3 / 2) {
                    System.out.print("*");
                    continue;
                }
                // corner diagonals stars
                if ((i == 1 || i == n3 - 2) && (j == 1 || j == n3 - 2)) {
                    System.out.print("*");
                    continue;
                }
                // void
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int n4 = 5;
        for (int i = 0; i < n4; i++) {
            // void, successively decreased by i
            for (int j = n4 - i; j > 1; j--) {
                System.out.print(" ");
            }
            // casual * print
            for (int j = 0; j < n4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P4 ======");


        // P5
        System.out.println("P4 ======");

        int n5 = 5;
        for (int i = 0; i < n5; i++) {
            // void, successively increased with i
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // casual * print
            for (int j = 0; j < n5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P4 ======");

    }
}
