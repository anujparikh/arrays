package practice.examples;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example:
 *  Given input matrix =
 *      [
 *          [1,2,3],
 *          [4,5,6],
 *          [7,8,9]
 *      ],
 *
 *  rotate the input matrix in-place such that it becomes:
 *      [
 *          [7,4,1],
 *          [8,5,2],
 *          [9,6,3]
 *      ]
 */
public class RotateImage {
    public static void solution(int[][] matrix) {
        int length = matrix.length-1;
        for (int i = 0; i <= (length)/2; i++) {
            if (matrix[i].length == 0) {
                return;
            }
            for (int j = i; j < length-i; j++) {

                //Coordinate 1
                int p1 = matrix[i][j];

                //Coordinate 2
                int p2 = matrix[j][length-i];

                //Coordinate 3
                int p3 = matrix[length-i][length-j];

                //Coordinate 4
                int p4 = matrix[length-j][i];

                //Swap values of 4 coordinates.
                matrix[j][length-i] = p1;
                matrix[length-i][length-j] = p2;
                matrix[length-j][i] = p3;
                matrix[i][j] = p4;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
