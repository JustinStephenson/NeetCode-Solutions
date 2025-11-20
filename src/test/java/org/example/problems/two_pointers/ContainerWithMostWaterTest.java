package org.example.problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @ParameterizedTest
    @MethodSource("containerWithMostWaterProvider")
    void containerWithMostWaterTest(int[] input, int expectedResult) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.maxArea(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> containerWithMostWaterProvider() {
        return Stream.of(
            Arguments.of(new int[]{1, 7, 2, 5, 4, 7, 3, 6}, 36),
            Arguments.of(new int[]{2, 2, 2}, 4)
        );
    }
}