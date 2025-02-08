package DsaFundamentals.ControlFlow;

public class TriangularNumberPatterns3 {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int n1 = 5;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("P1 ======");

        // P2
        System.out.println("P2 ======");

        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("P2 ======");


        // P3
        System.out.println("P3 ======");

        int n3 = 5;
        int signCounter = 0;
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j <= i; j++) {
                if (signCounter % 2 == 0) System.out.print("1");
                else System.out.print("0");
                signCounter++;
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int n4 = 5;
        for (int i = 0; i < n4; i++) {
            for (int j = 0; j <= i; j++) {
                if (i < n4 - 1 && j > 0 && j < i) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("P4 ======");
    }
}
