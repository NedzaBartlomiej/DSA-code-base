package DsaFundamentals.ControlFlow;

public class PyramidStarPatterns {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int n1 = 5;
        for (int i = 0; i < n1; i++) {
            for (int j = n1 - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P1 ======");


        // P2
        System.out.println("P2 ======");

        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            for (int j = n2 - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                if (i == n2 - 1 || j == 0 || j == i * 2) {
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
        for (int i = n3; i > 0; i--) {
            for (int j = n3 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int n4 = 5;
        for (int i = n4; i > 0; i--) {
            for (int j = n4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                if (i == n4 || j == i * 2 - 1 || j == 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("P4 ======");
    }
}
