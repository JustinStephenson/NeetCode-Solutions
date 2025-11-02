package org.example.problems.linked_list;

import org.example.data_structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @ParameterizedTest
    @MethodSource("mergeTwoSortedListsTestProvider")
    void mergeTwoSortedListsTest(ListNode list1, ListNode list2, ListNode expectedResult) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> mergeTwoSortedListsTestProvider() {
        return Stream.of(
                Arguments.of(ListNode.of(1, 2, 4), ListNode.of(1, 3, 5), ListNode.of(1, 1, 2, 3, 4, 5)),
                Arguments.of(null, ListNode.of(1, 2), ListNode.of(1, 2)),
                Arguments.of(null, null, null)
        );
    }
}