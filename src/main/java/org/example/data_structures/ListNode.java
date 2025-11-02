package org.example.data_structures;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {}
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
}
