package leetcode.test.easy;

import leetcode.easy.BalancedBinaryTree;
import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
https://leetcode.com/problems/balanced-binary-tree/
Problem:
Given a binary tree, determine if it is
height-balanced
.
*/

public class BalancedBinaryTreeTest {
    final BalancedBinaryTree balancedBinaryTree;
    BalancedBinaryTreeTest() {
        balancedBinaryTree = new BalancedBinaryTree();
    }
    @Test
    void testBalancedTree() {
        //Input: root = [3,9,20,null,null,15,7]
        //Output: true
        // Creating a tree like
        //            3
        //          /  \
        //        9     20
        //            /    \
        //          15      7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(root));

    }
    @Test
    void testUnbalancedTree() {
        // Input: root = [1,2,2,3,3,null,null,4,4]
        // Output: false
        // Creating a tree like
        //            1
        //          /  \
        //        2     2
        //      /    \
        //    3       3
        //   /         \
        //  4           4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.right.right = new TreeNode(4);
        assertFalse(balancedBinaryTree.isBalanced(root));

    }

    @Test
    void emptyTree() {
        //Input: root = []
        //Output: true
        TreeNode root = null;
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testBottomUpApproach() {
        //Input: root = [3,9,20,null,null,15,7]
        //Output: true
        // Creating a tree like
        //            3
        //          /  \
        //        9     20
        //            /    \
        //          15      7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced2(root));
    }

}
