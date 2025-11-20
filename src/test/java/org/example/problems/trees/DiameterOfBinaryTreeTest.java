package org.example.problems.trees;

import org.example.data_structures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("diameterOfBinaryTreeTestProvider")
    void diameterOfBinaryTreeTest(TreeNode root, int expected) {
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        int result = diameterOfBinaryTree.diameterOfBinaryTree(root);
        assertEquals(expected, result);
    }

    static Stream<Arguments> diameterOfBinaryTreeTestProvider() {
        return Stream.of(
            // Input: [1,null,2,3,4,5] → Expected: 3
            Arguments.of(
                TreeNode.of(1, null, 2, 3, 4, 5),
                3
            ),

            // Input: [1,2,3] → Expected: 2
            Arguments.of(
                TreeNode.of(1, 2, 3),
                2
            )
        );
    }
}