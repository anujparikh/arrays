package practice.examples;

public class MatrixZeroes {
    public static void solution(int [][] matrix) {
        /**
         * Using boolean 2D matrix
         */
        /*
            int n = matrix.length;
            int m = matrix[0].length;

            boolean [][] boolMatrix = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        boolMatrix[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (boolMatrix[i][j]) {
                        for (int k = 0; k < m; k++) {
                            matrix[i][k] = 0;
                        }
                        for (int k = 0; k < n; k++) {
                            matrix[k][j] = 0;
                        }
                    }
                }
            }
        */
        /**
         * Using O(1) extra memory space
         * Approach: Mark 0th row to indicate if that columns has 0 and mark 0th column to indicate if that row has 0
         * Handle 0th row and column separately (as they have common indicator)
         */
        int rowsLength = matrix.length;
        int columnsLength = matrix[0].length;
        boolean row0State = false;
        boolean col0State = false;

        for (int row = 0; row < rowsLength; row++) {
            if (matrix[row][0] == 0) {
                col0State = true;
                break;
            }
        }

        for (int column = 0; column < columnsLength; column++) {
            if (matrix[0][column] == 0) {
                row0State = true;
                break;
            }
        }

        for (int row = 1; row < rowsLength; row++) {
            for (int column = 1; column < columnsLength; column++) {
                if (matrix[row][column] == 0) {
                    matrix[0][column] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        for (int row = 1; row < rowsLength; row++) {
            if (matrix[row][0] == 0) {
                for (int column = 0; column < columnsLength; column++) {
                    matrix[row][column] = 0;
                }
            }
        }

        for (int column = 1; column < columnsLength; column++) {
            if (matrix[0][column] == 0) {
                for (int row = 0; row < rowsLength; row++) {
                    matrix[row][column] = 0;
                }
            }
        }

        if (row0State) {
            for (int i = 0; i < columnsLength; i++) {
                matrix[0][i] = 0;
            }
        }

        if (col0State) {
            for (int i = 0; i < rowsLength; i++) {
                matrix[i][0] = 0;
            }
        }

        for (int i = 0; i < rowsLength; i++) {
            System.out.println(" ");
            for (int j = 0; j < columnsLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
