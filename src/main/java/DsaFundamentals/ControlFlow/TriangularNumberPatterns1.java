package DsaFundamentals.ControlFlow;

public class TriangularNumberPatterns1 {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int n1 = 5;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println("P1 ======");

        // P2
        System.out.println("P2 ======");

        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2 - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println("P2 ======");


        // P2
        System.out.println("P3 ======");

        int n3 = 5;
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3 - i; j++) {
                System.out.print(n3 - i);
            }
            System.out.println();
        }

        System.out.println("P3 ======");

        // P4.1
        System.out.println("P4.1 ======");

        int n41 = 5;
        for (int i = 0; i < n41; i++) {
            for (int j = 0; j < n41 - i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println("P4.1 ======");

        // P4.2
        System.out.println("P4.2 ======");

        int n42 = 5;
        for (int i = 0; i < n42; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n42 - i);
            }
            System.out.println();
        }

        System.out.println("P4.2 ======");

        // P5.1
        System.out.println("P5.1 ======");

        int n51 = 5;
        for (int i = 0; i < n51; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println("P5.1 ======");

        // P5.2
        System.out.println("P5.2 ======");

        int n52 = 5;
        for (int i = 0; i < n52; i++) {
            for (int j = 0; j < n52 - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println("P5.2 ======");
    }
}
