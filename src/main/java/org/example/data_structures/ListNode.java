package org.example.data_structures;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListNode)) {
            return false;
        }
        ListNode other = (ListNode) obj;
        return val == other.val
            && Objects.equals(next, other.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    /**
     * Constructs a singly linked list from a variable-length array of integers.
     *
     * @param values The sequence of integer values to populate the linked list. If null or empty, returns null.
     * @return The head node of the constructed linked list, or null if the input is null or empty.
     */
    public static ListNode of(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    /**
     * Creates a linked list from the given array of values and introduces a cycle at the specified position.
     *
     * @param pos    The position (0-based index) where the cycle begins in the resulting linked list. If the value is -1, no cycle is created.
     * @param values An array of integers used to populate the linked list. If null or empty, returns null.
     * @return The head of the created linked list with or without a cycle, depending on the specified position.
     */
    public static ListNode ofWithCycle(int pos, int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) {
                cycleEntry = current;
            }
        }

        if (pos == 0) {
            cycleEntry = head;
        }

        if (pos >= 0 && pos < values.length) {
            current.next = cycleEntry;
        }

        return head;
    }
}
