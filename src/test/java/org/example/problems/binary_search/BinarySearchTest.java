package org.example.problems.binary_search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("binarySearchTestProvider")
    void binarySearchTest(int[] input, int target, int expectedResult) {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(input, target);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> binarySearchTestProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,2,4,6,8}, 4, 3),
                Arguments.of(new int[]{-1,0,2,4,6,8}, 3, -1)
        );
    }
}