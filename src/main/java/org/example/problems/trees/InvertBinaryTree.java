package org.example.problems.trees;

import org.example.data_structures.TreeNode;

/*
    You are given the root of a binary tree root. Invert the binary tree and return its root.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftInvertedTree = invertTree(root.left);
        TreeNode rightInvertedTree = invertTree(root.right);

        root.left = rightInvertedTree;
        root.right = leftInvertedTree;

        return root;
    }
}
