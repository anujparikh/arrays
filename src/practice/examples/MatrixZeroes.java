package practice.examples;

public class MatrixZeroes {
    public static void solution(int [][] matrix) {
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
    }
}
