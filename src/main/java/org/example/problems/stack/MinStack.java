package org.example.problems.stack;

import java.util.Stack;

/*
    Design a stack class that supports the push, pop, top, and getMin operations.

        MinStack() initializes the stack object.
        void push(int val) pushes the element val onto the stack.
        void pop() removes the element on the top of the stack.
        int top() gets the top element of the stack.
        int getMin() retrieves the minimum element in the stack.

    Each function should run in O(1)O(1) time.
 */
public class MinStack {
    private Stack<Integer> baseStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        this.baseStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        baseStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        if (baseStack.isEmpty()) {
            return;
        }
        baseStack.pop();
        minStack.pop();
    }

    public int top() {
        return baseStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return 0;
        } else {
            return minStack.peek();
        }
    }
}
