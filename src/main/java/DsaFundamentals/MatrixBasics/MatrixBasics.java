package DsaFundamentals.MatrixBasics;

import java.util.Arrays;

public class MatrixBasics {
    public static void main(String[] args) {
        // only method's tests here (arranged) 1. - n.:
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] matrix1 = {{1, 2, 3, 4}, {6, 8, 7, 5}, {9, 12, 11, 10}};
        int[][] matrix2 = {{7, 3, 2, 1}, {6, 9, 3, 12}, {9, 23, 24, 11}};

        // 1.
        printAMatrixRowWiseAndColumnWise(mat);

        // 2.
        System.out.println(calculateTheTotalSumOfElementsInAMatrix(mat));

        // 3.
        calculateTheSumOfEachRowAndEachColumnInAMatrix(mat);

        // 4.
        findTheMaximumAndMinimumValuesInEachRowOfAMatrix(mat);

        // 5.
        findTheMaximumAndMinimumValuesInEachColumnOfAMatrix(mat);

        // 6.
        addTwoMatrices(matrix1, matrix2);

        // 7.
        int[][] matrixA = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}
        };
        printTheUpperTriangleAndLowerTriangleOfAMatrix(matrixA);

        // 8.
        printTheLeftAndRightDiagonalsOfAMatrix(matrixA);

        // 9.
        printAllDiagonalsFromTopLeftToBottomRight(matrixA);
    }

    // 1.
    private static void printAMatrixRowWiseAndColumnWise(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("row " + i + ": ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mat[0].length; i++) {
            System.out.print("col " + i + ": ");
            for (int[] row : mat) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }

    // 2.
    private static long calculateTheTotalSumOfElementsInAMatrix(int[][] mat) {
        long sum = 0;
        for (int[] row : mat) {
            for (int col : row) {
                sum += col;
            }
        }
        return sum;
    }

    // 3.
    private static void calculateTheSumOfEachRowAndEachColumnInAMatrix(int[][] mat) {
        // row sum
        for (int i = 0; i < mat.length; i++) {
            long rowSum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("row " + i + "sum = " + rowSum);
        }
        // col sum
        for (int i = 0; i < mat[0].length; i++) {
            long colSum = 0;
            for (int[] row : mat) {
                colSum += row[i];
            }
            System.out.println("col " + i + "sum = " + colSum);
        }
    }

    // 4.
    private static void findTheMaximumAndMinimumValuesInEachRowOfAMatrix(int[][] mat) {
        if (mat.length == 0) return;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length == 0) continue;
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < mat[i].length; j++) {
                int currVal = mat[i][j];
                if (currVal > maxVal) maxVal = currVal;
                if (currVal < minVal) minVal = currVal;
            }
            System.out.println("row " + i + " maxVal=" + maxVal);
            System.out.println("row " + i + " minVal=" + minVal);
        }
    }

    // 5.
    private static void findTheMaximumAndMinimumValuesInEachColumnOfAMatrix(int[][] mat) {
        if (mat.length == 0) return;
        for (int i = 0; i < mat[0].length; i++) {
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;
            for (int[] row : mat) {
                int currVal = row[i];
                if (currVal > maxVal) maxVal = currVal;
                if (currVal < minVal) minVal = currVal;
            }
            System.out.println("col " + i + " maxVal=" + maxVal);
            System.out.println("col " + i + " minVal=" + minVal);
        }
    }

    // 6.
    private static void addTwoMatrices(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) return;
        int[][] addMatrix = new int[mat1.length][];

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) return;
            addMatrix[i] = new int[mat1[i].length];
            for (int j = 0; j < mat1[i].length; j++) {
                addMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(addMatrix));
    }

    // 7.
    private static void printTheUpperTriangleAndLowerTriangleOfAMatrix(int[][] mat) {
        // upper
        int[][] upper = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            upper[i] = new int[mat[i].length];
            for (int j = mat[i].length - 1; j >= i; j--) {
                upper[i][j] = mat[i][j];
            }
        }
        System.out.println("upper: " + Arrays.deepToString(upper));

        // lower
        int[][] lower = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            lower[i] = new int[mat[i].length];
            for (int j = 0; j <= i; j++) {
                lower[i][j] = mat[i][j];
            }
        }
        System.out.println("lower: " + Arrays.deepToString(lower));
    }

    // 8.
    private static void printTheLeftAndRightDiagonalsOfAMatrix(int[][] mat) {

        // left
        int[] left = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) left[i] = mat[i][j];
            }
        }
        System.out.println(Arrays.toString(left));

        // right
        int[] right = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat.length - 1; j >= mat.length - 1 - i; j--) {
                if (j == mat.length - 1 - i) right[i] = mat[i][j];
            }
        }
        System.out.println(Arrays.toString(right));
    }

    // 9. todo with clear mind
    private static void printAllDiagonalsFromTopLeftToBottomRight(int[][] mat) {

    }
}