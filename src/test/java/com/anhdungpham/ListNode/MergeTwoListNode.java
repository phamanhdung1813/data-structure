package com.anhdungpham.ListNode;

public class MergeTwoListNode {
    public ListNode MergeTwoListNode(ListNode list1, ListNode list2) {
        ListNode header = new ListNode(0);
        ListNode currentNode = header;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }
        return header.next;
    }
}
