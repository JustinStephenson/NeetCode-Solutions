package org.example.problems.linked_list;

import org.example.data_structures.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }

        return previous;
    }
}
