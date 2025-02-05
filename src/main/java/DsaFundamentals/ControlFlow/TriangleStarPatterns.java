package DsaFundamentals.ControlFlow;

public class TriangleStarPatterns {
    public static void main(String[] args) {

        // P1
        System.out.println("P1 ======");

        int n1 = 10;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P1 ======");


        // P2
        System.out.println("P2 ======");

        int n2 = 10;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == n2 - 1 || j == 0 || j == i) {
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
            for (int j = 0; j < n3 - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int n4 = 5;
        for (int i = 0; i < n4; i++) {
            for (int j = 0; j < n4 - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == n4 - 1 || j == 0 || j == i) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("P4 ======");


        // P5
        System.out.println("P5 ======");

        int n5 = 5;
        for (int i = 0; i < n5; i++) {
            for (int j = n5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("P5 ======");

    }
}
