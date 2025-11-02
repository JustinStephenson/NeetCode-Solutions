package org.example.problems.linked_list;

import org.example.data_structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @ParameterizedTest
    @MethodSource("reverseLinkedListTestProvider")
    void reverseLinkedListTest(ListNode input, ListNode expectedResult) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode result = reverseLinkedList.reverseList(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> reverseLinkedListTestProvider() {
        return Stream.of(
                Arguments.of(ListNode.of(0, 1, 2, 3), ListNode.of(3, 2, 1, 0)),
                Arguments.of(null, null)
        );
    }
}