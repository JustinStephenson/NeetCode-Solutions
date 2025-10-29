package org.example.problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @ParameterizedTest
    @MethodSource("trappingRainWaterProvider")
    void trappingRainWaterTest(int[] input, int expectedResult) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> trappingRainWaterProvider() {
        return Stream.of(
                Arguments.of(new int[]{0,2,0,3,1,0,1,3,2,1}, 9)
        );
    }
}