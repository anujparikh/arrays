package practice.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSum {
    public static List<List<Integer>> solution(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(candidates, target, 0, current, combinations);
        return combinations;
    }

    private static void backtracking(int[] candidates, int target, int index, List<Integer> current,  List<List<Integer>> combinations) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        if (index < candidates.length) {
            current.add(candidates[index]);
            backtracking(candidates, target - candidates[index], index, current, combinations);
            current.remove(current.size() - 1);
            backtracking(candidates, target, index + 1, current, combinations);
        }
        return;
    }
}
