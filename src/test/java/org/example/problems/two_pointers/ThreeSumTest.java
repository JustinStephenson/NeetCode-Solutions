package org.example.problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("threeSumTestProvider")
    void threeSumTest(int[] input, List<List<Integer>> expectedResult) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> threeSumTestProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1,0,1,2,-1,-4},
                        List.of(
                                List.of(-1, -1, 2),
                                List.of(-1, 0, 1)
                        )
                ),
                Arguments.of(
                        new int[]{0,1,1},
                        List.of()
                ),
                Arguments.of(
                        new int[]{0,0,0},
                        List.of(
                                List.of(0, 0, 0)
                        )
                ),
                Arguments.of(
                        new int[]{0,0,0,0},
                        List.of(
                                List.of(0, 0, 0)
                        )
                )
        );
    }
}