package org.example.problems.linked_list;

import org.example.data_structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @ParameterizedTest
    @MethodSource("linkedListCycleTestProvider")
    void linkedListCycleTest(ListNode input, boolean expectedResult) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean result = linkedListCycle.hasCycle(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> linkedListCycleTestProvider() {
        return Stream.of(
                Arguments.of(ListNode.ofWithCycle(1, 1, 2, 3, 4), true),
                Arguments.of(ListNode.of(1, 2), false)
        );
    }
}