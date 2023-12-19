package leetcode.easy;

import util.ListNode;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycleFloyd(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public boolean hasCycleHashSet(ListNode head) {
        Set<ListNode> hashSet = new HashSet<>();

        while(head != null) {
            if(hashSet.contains(head)) return true;
            hashSet.add(head);
            head = head.next;
        }
        return false;
    }
}
