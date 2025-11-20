package org.example.problems.trees;

import org.example.data_structures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("balancedBinaryTreeTestProvider")
    void balancedBinaryTreeTest(TreeNode input, boolean expectedResult) {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean result = balancedBinaryTree.isBalanced(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> balancedBinaryTreeTestProvider() {
        return Stream.of(
            // Input: [1,2,3,null,null,4] → Output: true
            Arguments.of(
                TreeNode.of(1, 2, 3, null, null, 4),
                true
            ),

            // Input: [1,2,3,null,null,4,null,5] → Output: false
            Arguments.of(
                TreeNode.of(1, 2, 3, null, null, 4, null, 5),
                false
            ),

            // Input: [] → Output: true (empty tree is balanced)
            Arguments.of(
                TreeNode.of(),  // or null
                true
            )
        );
    }
}