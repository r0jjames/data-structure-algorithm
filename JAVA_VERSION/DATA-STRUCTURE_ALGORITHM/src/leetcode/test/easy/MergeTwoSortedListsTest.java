package leetcode.test.easy;

import leetcode.easy.MergeTwoSortedLists;
import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
https://leetcode.com/problems/merge-two-sorted-lists/
21. Merge Two Sorted Lists
Problem:
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */
class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void testMergeTwoLists1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoSortedLists.mergeTwoLists2(l1, l2);
        assertEquals(1, listNode.val);
        assertEquals(1, listNode.next.val);
        assertEquals(2, listNode.next.next.val);
        assertEquals(3, listNode.next.next.next.val);
        assertEquals(4, listNode.next.next.next.next.val);
        assertEquals(4, listNode.next.next.next.next.next.val);
    }

    @Test
    void testMergeTwoLists2() {
        ListNode l1 = null;

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoSortedLists.mergeTwoLists2(l1, l2);
        assertEquals(2, listNode.val);
        assertEquals(3, listNode.next.val);
        assertEquals(4, listNode.next.next.val);
    }
}
