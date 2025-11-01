package org.example.problems.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private void backtrack(int openN, int closedN, int n, List<String> resultString, StringBuilder stack) {
        if (openN == closedN && openN == n) {
            resultString.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append('(');
            backtrack(openN + 1, closedN, n, resultString, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if (closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN + 1, n, resultString, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, resultList, stack);
        return resultList;
    }
}
