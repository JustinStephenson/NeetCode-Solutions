package org.example.problems.trees;

import org.example.data_structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public TreeNode invertTreeIterativeDFS(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return root;
    }

    public TreeNode invertTreeBFS(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }
}
