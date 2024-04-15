package leetcode.easy;


import util.ListNode;

import java.util.ArrayList;


public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};
        ListNode list1 = insert(nums1);
        ListNode list2 = insert(nums2);
        printList(mergeTwoLists(list1, list2)); //[1,1,2,3,4,4]

    }
    // Efficient Method
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode(0);
        ListNode headNode = currentNode;
        while(l1 != null && l2 != null) {
            if(l1.val <=  l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if(l1 == null) {
            currentNode.next = l2;
        } else {
            currentNode.next = l1;
        }
        return headNode.next;
    }
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        final ListNode currentNode = new ListNode();
        ListNode ptr = currentNode;
        while (list1 != null & list2 != null) {
            if(list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        ptr.next = list1 != null ? list1 : list2;
        return currentNode.next;
    }

    public static ListNode insert(int[] nums) {

        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        for(int i: nums) {
            ListNode node = new ListNode(i);
            newNode.next = node;
            newNode = newNode.next;
        }
        return temp.next;

    }
    public static void printList(ListNode node) {
        ArrayList<Integer> arr = new ArrayList();
        while(node != null) {
            arr.add(node.val);
            node = node.next;
        }
        System.out.println(arr);
    }

}
