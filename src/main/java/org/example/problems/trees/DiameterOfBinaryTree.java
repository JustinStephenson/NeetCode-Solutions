package org.example.problems.trees;

import org.example.data_structures.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/*
    The diameter of a binary tree is defined as the length of the longest path between any two nodes within the tree.
    The path does not necessarily have to pass through the root.

    The length of a path between two nodes in a binary tree is the number of edges between the nodes.
    Note that the path cannot include the same node twice.

    Given the root of a binary tree root, return the diameter of the tree.
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        AtomicInteger maxHeight = new AtomicInteger(0);
        maxHeightOfTree(root, maxHeight);
        return maxHeight.get();
    }

    public int maxHeightOfTree(TreeNode root, AtomicInteger maxHeight) {
        if (root == null) {
            return 0;
        }

        int diameterLeftTree = maxHeightOfTree(root.left, maxHeight);
        int diameterRightTree = maxHeightOfTree(root.right, maxHeight);

        maxHeight.set(Math.max(maxHeight.get(), diameterLeftTree + diameterRightTree));

        return Math.max(diameterLeftTree, diameterRightTree) + 1;
    }
}
