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
    // BFS Approach: Iterative
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int level = 0;

        while (!nodeQueue.isEmpty()) {
            level++;
            int size = nodeQueue.size();
            for(int i=0; i < size; i++) {
                nodeQueue.add(root);
                TreeNode node = nodeQueue.poll();
                if(node.left != null) nodeQueue.add(node.left);
                if(node.right != null) nodeQueue.add(node.right);
            }
        }
        return level;

    }
    // DFS Approach: Recursive
    public int maxDepthRecursion(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursion(root.left), maxDepthRecursion(root.right));
    }
}