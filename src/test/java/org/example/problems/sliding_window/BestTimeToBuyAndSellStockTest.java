package org.example.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource("bestTimeToBuyAndSellStockProvider")
    void bestTimeToBuyAndSellStockTest(int[] input, int expectedResult) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int result = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> bestTimeToBuyAndSellStockProvider() {
        return Stream.of(
            Arguments.of(new int[]{10, 1, 5, 6, 7, 1}, 6),
            Arguments.of(new int[]{10, 8, 7, 5, 2}, 0)
        );
    }
}