package leetcode.test.easy;

import leetcode.easy.MergeTwoSortedLists;
import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(l1, l2);
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

        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(2, listNode.val);
        assertEquals(3, listNode.next.val);
        assertEquals(4, listNode.next.next.val);
    }
}
