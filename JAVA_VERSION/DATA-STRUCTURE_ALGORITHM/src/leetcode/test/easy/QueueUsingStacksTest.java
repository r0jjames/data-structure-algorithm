package leetcode.test.easy;

import leetcode.easy.QueueUsingStacks;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/implement-queue-using-stacks/
232. Implement Queue using Stacks
Problem:
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false

 */
public class QueueUsingStacksTest {
    private final QueueUsingStacks myQueue;
    QueueUsingStacksTest() {
        myQueue = new QueueUsingStacks();
    }

    @Test
    void testQueueUsingTwoStacks() {
        Queue<Integer> actualQueue = new LinkedList<>();

        myQueue.enqueue(4);
        myQueue.enqueue(8);
        myQueue.enqueue(15);

        actualQueue.add(4);
        actualQueue.add(8);
        actualQueue.add(15);

        int expected = actualQueue.poll();
        assertEquals(expected, myQueue.dequeue());

        myQueue.dequeue();
        myQueue.enqueue(16);

        actualQueue.poll();
        actualQueue.add(16);

        expected = actualQueue.peek();
        assertEquals(expected, myQueue.peek());
        assertEquals(myQueue.isEmpty(), actualQueue.isEmpty());
    }
}
