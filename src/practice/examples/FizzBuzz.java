package practice.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 15 == 0) output.add("FizzBuzz");
                else if (i % 3 == 0) output.add("Fizz");
                else output.add("Buzz");
            } else {
                output.add(i + "");
            }
        }
        return output;
    }
}
