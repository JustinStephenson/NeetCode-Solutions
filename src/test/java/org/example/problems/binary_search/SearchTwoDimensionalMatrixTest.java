package org.example.problems.binary_search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchTwoDimensionalMatrixTest {

    @ParameterizedTest
    @MethodSource("searchMatrixTestProvider")
    void searchMatrixTest(int[][] input, int target, boolean expectedResult) {
        SearchTwoDimensionalMatrix searchTwoDimensionalMatrix = new SearchTwoDimensionalMatrix();
        boolean result = searchTwoDimensionalMatrix.searchMatrix(input, target);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> searchMatrixTestProvider() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 2, 4, 8},
                        {10, 11, 12, 13},
                        {14, 20, 30, 40}
                }, 10, true),
                Arguments.of(new int[][]{
                        {1,2,4,8},
                        {10,11,12,13},
                        {14,20,30,40}
                }, 15, false)
        );
    }
}