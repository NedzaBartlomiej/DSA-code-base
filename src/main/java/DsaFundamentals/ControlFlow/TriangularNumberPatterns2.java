package DsaFundamentals.ControlFlow;

public class TriangularNumberPatterns2 {
    public static void main(String[] args) {
        // P1.1
        System.out.println("P1.1 ======");

        int n11 = 5;
        for (int i = 0; i < n11; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            System.out.println();
        }

        System.out.println("P1.1 ======");

        // P1.2
        System.out.println("P1.2 ======");

        int n12 = 5;
        for (int i = 0; i < n12; i++) {
            for (int j = 0; j < n12 - i; j++) {
                System.out.print(n12 - j - i);
            }
            System.out.println();
        }

        System.out.println("P1.2 ======");

        // P2.1
        System.out.println("P2.1 ======");

        int n21 = 5;
        for (int i = 0; i < n21; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n21 - j);
            }
            System.out.println();
        }

        System.out.println("P2.1 ======");


        // P2.2
        System.out.println("P2.2 ======");

        int n22 = 5;
        for (int i = 0; i < n22; i++) {
            for (int j = 0; j < n22 - i; j++) {
                System.out.print(n22 - j);
            }
            System.out.println();
        }

        System.out.println("P2.2 ======");


        // P3.1
        System.out.println("P3.1 ======");

        int n31 = 5;
        for (int i = 0; i < n31; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n31 - i + j);
            }
            System.out.println();
        }

        System.out.println("P3.1 ======");


        // P3.2
        System.out.println("P3.2 ======");

        int n32 = 5;
        for (int i = 0; i < n32; i++) {
            for (int j = 0; j < n32 - i; j++) {
                System.out.print(j + 1 + i);
            }
            System.out.println();
        }

        System.out.println("P3.2 ======");


        // P4.1
        System.out.println("P4.1 ======");

        int n41 = 5;
        for (int i = 0; i < n41; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + i);
            }
            System.out.println();
        }

        System.out.println("P4.1 ======");


        // P4.2
        System.out.println("P4.2 ======");

        int n42 = 5;
        for (int i = 0; i < n42; i++) {
            for (int j = 0; j < n42 - i; j++) {
                System.out.print(n42 + j - i);
            }
            System.out.println();
        }

        System.out.println("P4.2 ======");


        // P5.1
        System.out.println("P5.1 ======");

        int n51 = 5;
        for (int i = 0; i < n51; i++) {
            for (int j = 0; j < n51 - i; j++) {
                System.out.print((i + 1) * 2 - 1 + j * 2);
            }
            System.out.println();
        }

        System.out.println("P5.1 ======");


        // P5.2
        System.out.println("P5.2 ======");

        int n52 = 5;
        for (int i = 0; i < n52; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n51 * 2 - 1 - i * 2 + j * 2);
            }
            System.out.println();
        }

        System.out.println("P5.2 ======");
    }
}
