package DsaFundamentals.ControlFlow;

public class NumberPatterns2 {
    public static void main(String[] args) {
        // P1
        System.out.println("P1 ======");

        int rows1 = 5;
        int cols1 = 5;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println("P1 ======");


        // P2
        System.out.println("P2 ======");

        int rows2 = 5;
        int cols2 = 5;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println("P2 ======");


        // P3
        System.out.println("P3 ======");

        int rows3 = 5;
        int cols3 = 5;
        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                System.out.print(j + 1 + i);
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int rows4 = 5;
        int cols4 = 5;
        int val1 = 0;
        for (int i = 0; i < rows4; i++) {
            for (int j = 0; j < cols4; j++) {
                System.out.print(++val1 + " ");
            }
            System.out.println();
        }

        System.out.println("P4 ======");

        // P5
        System.out.println("P5 ======");

        int rows5 = 5;
        int cols5 = 5;
        int val2 = cols5;
        for (int i = 0; i < rows5; i++) {
            for (int j = 0; j < cols5; j++) {
                if (j <= i) {
                    System.out.print(cols5 - j);
                } else {
                    System.out.print(val2);
                }
            }
            System.out.println();
            val2--;
        }

        System.out.println("P5 ======");


        // P6
        System.out.println("P6 ======");

        int rows6 = 5;
        int cols6 = 5;
        int val3 = cols6;
        for (int i = 0; i < rows6; i++) {
            for (int j = 0; j < cols6; j++) {
                if (j < cols6 - 1 - i) {
                    System.out.print(val3);
                } else {
                    System.out.print(j + 1);
                }
            }
            System.out.println();
            val3--;
        }

        System.out.println("P6 ======");
    }
}
