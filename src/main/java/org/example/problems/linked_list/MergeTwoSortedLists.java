package org.example.problems.linked_list;

import org.example.data_structures.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode resultList = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                resultList.next = list1;
                list1 = list1.next;
            } else {
                resultList.next = list2;
                list2 = list2.next;
            }
            resultList = resultList.next;
        }

        if (list1 != null) {
            resultList.next = list1;
        } else {
            resultList.next = list2;
        }

        return head.next;
    }
}
