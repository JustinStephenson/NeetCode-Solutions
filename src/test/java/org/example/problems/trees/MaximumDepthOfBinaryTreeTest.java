package org.example.problems.trees;

import org.example.data_structures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("maximumDepthOfBinaryTreeTestProvider")
    void maximumDepthOfBinaryTreeTest(TreeNode input, int expectedResult) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int result = maximumDepthOfBinaryTree.maxDepth(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> maximumDepthOfBinaryTreeTestProvider() {
        return Stream.of(
                // [1,2,3,null,null,4] → depth 3
                Arguments.of(TreeNode.of(1, 2, 3, null, null, 4), 3),

                // [] → depth 0
                Arguments.of(null, 0)
        );
    }
}