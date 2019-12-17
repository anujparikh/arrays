package practice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * Example:
 *  Input: 5
 *  Output:
 *     [
 *          [1],
*          [1,1],
*         [1,2,1],
 *       [1,3,3,1],
 *      [1,4,6,4,1]
 *     ]
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);
        if (numRows == 1) {
            return output;
        }
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        output.add(secondRow);
        if (numRows == 2) {
            return output;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> previous = output.get(i - 1);
                row.add(previous.get(j - 1) + previous.get(j));
            }
            row.add(1);
            output.add(row);
        }
        return output;
    }
}
