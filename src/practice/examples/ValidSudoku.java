package practice.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *  1. Each row must contain the digits 1-9 without repetition.
 *  2. Each column must contain the digits 1-9 without repetition.
 *  3. Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */

/**
 * Another approach
 *  - Collect the set of things we see, encoded as strings. For example:
 *      '4' in row 7 is encoded as "(4)7".
 *      '4' in column 7 is encoded as "7(4)".
 *      '4' in the top-right block is encoded as "0(4)2".
 *      Scream false if we ever fail to add something because it was already added (i.e., seen before).
 */
public class ValidSudoku {
    public static boolean solution(char[][] board) {
        System.out.println("Start");
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if((!rowSet.add(board[i][j])) && board[i][j] != '.') {
                    System.out.println(rowSet.toString());
                    return false;
                }
            }
        }
        System.out.println("Done rows");
        for (int i = 0; i < 9; i++) {
            Set<Character> columnSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if((!columnSet.add(board[j][i])) && board[j][i] != '.') {
                    return false;
                }
            }
        }
        System.out.println("Done columns");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> boxSet = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char currentBoardValue = board[(i * 3) + k][(j * 3) + l];
                        if((!boxSet.add(currentBoardValue)) && currentBoardValue != '.') {
                            return false;
                        }
                    }
                }
            }
        }
        System.out.println("Done boxes");
        return true;
    }
}
