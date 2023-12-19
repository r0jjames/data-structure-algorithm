package leetcode.easy;

import util.TreeNode;

public class BalancedBinaryTree {
    // Approach: Top-down
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftNode = getHeight(root.left);
        int rightNode = getHeight(root.right);
        if(Math.abs(rightNode - leftNode) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    // Approach: Top-down
    public int getHeight(TreeNode node) {
        if(node == null) return 0;
        return 1+ Math.max(getHeight(node.left), getHeight(node.right));
    }
    //Approach Bottom Up
    public boolean isBalanced2(TreeNode root) {
        if(root == null) return true;
        return getHeight2(root) != -1;
    }
    //Approach Bottom Up
    public int getHeight2(TreeNode node) {
        if (node == null) return 0;
        int left = getHeight2(node.left);
        int right = getHeight2(node.right);
        int bf = Math.abs(right-left);
        if(bf > 1 || left == -1 || right == -1) return -1;
        return 1 + Math.max(left, right);
    }
}
