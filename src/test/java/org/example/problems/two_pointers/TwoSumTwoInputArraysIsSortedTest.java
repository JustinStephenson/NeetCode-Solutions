package org.example.problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTwoInputArraysIsSortedTest {

    @ParameterizedTest
    @MethodSource("twoSumTwoInputArraysIsSortedProvider")
    void twoSumTwoInputArraysIsSortedTest(int[] input, int target, int[] expectedResult) {
        TwoSumTwoInputArraysIsSorted twoSumTwoInputArraysIsSorted = new TwoSumTwoInputArraysIsSorted();
        int[] result = twoSumTwoInputArraysIsSorted.twoSum(input, target);
        assertArrayEquals(expectedResult, result);
    }

    static Stream<Arguments> twoSumTwoInputArraysIsSortedProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 3, new int[]{1,2}),
                Arguments.of(new int[]{-5,-3,0,2,4,6,8}, 5, new int[]{2,7})
        );
    }
}