package org.example.problems.backtracking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @ParameterizedTest
    @MethodSource("subsetsTestProvider")
    void subsetsTest(int[] input, List<List<Integer>> expectedResult) {
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> subsetsTestProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3},
                        List.of(
                                List.of(),
                                List.of(1),
                                List.of(2),
                                List.of(1, 2),
                                List.of(3),
                                List.of(1, 3),
                                List.of(2, 3),
                                List.of(1, 2, 3)
                        )
                ),

                Arguments.of(
                        new int[]{7},
                        List.of(
                                List.of(),
                                List.of(7)
                        )
                )
        );
    }
}