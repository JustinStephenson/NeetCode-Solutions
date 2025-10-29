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

    static Stream<Arguments> invertBinaryTreeTestProvider() {
        return Stream.of(
                // Input: [1,2,3,4,5,6,7] -> Output: [1,3,2,7,6,5,4]
                Arguments.of(
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(4),
                                        new TreeNode(5)
                                ),
                                new TreeNode(3,
                                        new TreeNode(6),
                                        new TreeNode(7)
                                )
                        ),
                        new TreeNode(1,
                                new TreeNode(3,
                                        new TreeNode(7),
                                        new TreeNode(6)
                                ),
                                new TreeNode(2,
                                        new TreeNode(5),
                                        new TreeNode(4)
                                )
                        )
                ),

                // Input: [3,2,1] -> Output: [3,1,2]
                Arguments.of(
                        new TreeNode(3,
                                new TreeNode(2),
                                new TreeNode(1)
                        ),
                        new TreeNode(3,
                                new TreeNode(1),
                                new TreeNode(2)
                        )
                ),

                // Input: [] -> Output: []
                Arguments.of(null, null)
        );
    }
}