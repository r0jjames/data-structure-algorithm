package leetcode.test.medium;

import leetcode.medium.LowestCommonAncestor;
import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 2:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2

 */
public class LowestCommonAncestorTest {
    final private LowestCommonAncestor lowestCommonAncestor;
    LowestCommonAncestorTest() {
        lowestCommonAncestor = new LowestCommonAncestor();
    }
    @Test
    void findLowestCommonAncestor() {
        // Example 1:
        //Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        //Output: 6
        //Explanation: The LCA of nodes 2 and 8 is 6.
        //            6
        //          /  \
        //        2     8
        //      /  \   /  \
        //     0    4 7    9
        //
        //
        int expectedOutput = 6;
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        leftNode.left = new TreeNode(0);
        leftNode.right = new TreeNode(4);
        rightNode.left = new TreeNode(7);
        rightNode.right = new TreeNode(9);
        assertEquals(expectedOutput, lowestCommonAncestor.lowestCommonAncestor(root, p, q).val);
    }


}
