package DsaFundamentals.ControlFlow;

public class NumberPatterns1 {
    public static void main(String[] args) {

        // P1
        System.out.println("P1 ======");

        int rows1 = 6;
        int cols1 = 5;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (i % 2 == 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("P1 ======");

        // P2
        System.out.println("P2 ======");

        int rows2 = 6;
        int cols2 = 5;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                if (j % 2 == 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("P2 ======");


        // P3
        System.out.println("P3 ======");

        int rows3 = 6;
        int cols3 = 5;
        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                if (i == 0 || i == rows3 - 1 || j == 0 || j == cols3 - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("P3 ======");


        // P4
        System.out.println("P4 ======");

        int rows4 = 5;
        int cols4 = 5;
        for (int i = 0; i < rows4; i++) {
            for (int j = 0; j < cols4; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print("1");
                } else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("P4 ======");


        // P5
        System.out.println("P5 ======");

        int rows5 = 5;
        int cols5 = 5;
        int rowCentIdx = rows5 / 2;
        int colCentIdx = cols5 / 2;
        for (int i = 0; i < rows5; i++) {
            for (int j = 0; j < cols5; j++) {
                if (i == rowCentIdx || j == colCentIdx) {
                    System.out.print("0");
                } else System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("P5 ======");


        // P6
        System.out.println("P6 ======");

        int rows6 = 5;
        int cols6 = 5;
        for (int i = 0; i < rows6; i++) {
            for (int j = 0; j < cols6; j++) {
                if (j == i || j == cols6 - 1 - i) {
                    System.out.print("1");
                } else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println("P6 ======");


        // P7
        System.out.println("P7 ======");

        int rows7 = 5;
        int cols7 = 5;
        for (int i = 0; i < rows7; i++) {
            for (int j = 0; j < cols7; j++) {
                if ((i == 0 || i == rows7 - 1) && (j == 0 || j == cols7 - 1)) {
                    System.out.print("0");
                } else if (i == 0 || i == rows7 - 1 || j == 0 || j == cols7 - 1) {
                    System.out.print("1");
                } else System.out.print("0");
            }
            System.out.println();
        }
        System.out.println("P7 ======");
    }
}
