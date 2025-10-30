package org.example.problems.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
    You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

    The input string s is valid if and only if:

        Every open bracket is closed by the same type of close bracket.
        Open brackets are closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

    Return true if s is a valid string, and false otherwise.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpenParentheses = new HashMap<>();
        closeToOpenParentheses.put(')', '(');
        closeToOpenParentheses.put('}', '{');
        closeToOpenParentheses.put(']', '[');

        for (Character character : s.toCharArray()) {
            if (closeToOpenParentheses.containsKey(character)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpenParentheses.get(character)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(character);
            }
        }

        return stack.isEmpty();
    }
}
