package leetcode.easy;
import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the
farthest leaf node.
 */
public class MaximumDepthOfABinaryTree {

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);
        int levels = 0;

        while (!nodes.isEmpty()) {

            levels++;
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poppedNode = nodes.poll();
                if (poppedNode.left != null) nodes.add(poppedNode.left);
                if (poppedNode.right != null) nodes.add(poppedNode.right);
            }

        }

        return levels;
    }
    // DFS
    public int maxDepthRecursion(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursion(root.left), maxDepthRecursion(root.right));
    }
}