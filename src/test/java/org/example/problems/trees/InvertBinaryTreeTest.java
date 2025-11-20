package org.example.problems.trees;

import org.example.data_structures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("invertBinaryTreeTestProvider")
    void invertBinaryTreeTest(TreeNode input, TreeNode expectedResult) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.invertTree(input);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("invertBinaryTreeTestProvider")
    void invertBinaryTreeIterativeDFSTest(TreeNode input, TreeNode expectedResult) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.invertTreeIterativeDFS(input);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("invertBinaryTreeTestProvider")
    void invertBinaryTreeBFSTest(TreeNode input, TreeNode expectedResult) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.invertTreeBFS(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> invertBinaryTreeTestProvider() {
        return Stream.of(
                // [1,2,3,4,5,6,7] → [1,3,2,7,6,5,4]
                Arguments.of(
                        TreeNode.of(1, 2, 3, 4, 5, 6, 7),
                        TreeNode.of(1, 3, 2, 7, 6, 5, 4)
                ),

                // [3,2,1] → [3,1,2]
                Arguments.of(
                        TreeNode.of(3, 2, 1),
                        TreeNode.of(3, 1, 2)
                ),

                // [] → []
                Arguments.of(null, null)
        );
    }
}