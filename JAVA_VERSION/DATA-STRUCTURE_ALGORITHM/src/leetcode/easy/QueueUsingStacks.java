package leetcode.easy;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void enqueue(int value) {
        input.add(value);
    }
    public int dequeue() {
        peek();
        return output.pop();
    }

    public int peek() {
        if(output.isEmpty()) {
            while (!input.isEmpty()) {
                output.add(input.pop());
            }
        }
        return output.peek();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
