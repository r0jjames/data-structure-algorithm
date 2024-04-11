package leetcode.easy;

import util.ListNode;
import java.util.Stack;
/*
https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseALinkedList {

    public ListNode reverseWithoutExtraSpace(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;

        return head;
    }

    public ListNode reverseWithStack(ListNode head) {
        Stack<Integer> valueStack = new Stack<>();
        while(head != null) {
            valueStack.push(head.val);
            head = head.next;
        }
        ListNode reverse = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reverse;
        while(!valueStack.isEmpty()) {
            ptr.next = new ListNode(valueStack.pop());
            ptr = ptr.next;
        }
        return reverse.next;
    }
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prev = null;
        while(currNode != null) {
            ListNode temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        head = prev;
        return head;
    }

}
