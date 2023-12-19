package leetcode.test.easy;

import leetcode.easy.LinkedListCycle;
import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
https://leetcode.com/problems/linked-list-cycle/
141. LinkedList Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

*/

public class LinkedListCycleTest {
    private final LinkedListCycle linkedListCycle;

    public LinkedListCycleTest() {
        this.linkedListCycle = new LinkedListCycle();
    }

    @Test
    void testHasCycle1() {
        //Input: head = [3,2,0,-4], pos = 1
        //Output: true
        //Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        assertTrue(linkedListCycle.hasCycleHashSet(head));
        assertTrue(linkedListCycle.hasCycleFloyd(head));
    }

    @Test
    void testHasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next;

        assertTrue(linkedListCycle.hasCycleHashSet(head));
        assertTrue(linkedListCycle.hasCycleFloyd(head));
    }
    @Test
    void testHasCycleFalse() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        assertFalse(linkedListCycle.hasCycleHashSet(head));
        assertFalse(linkedListCycle.hasCycleFloyd(head));
    }
}
