package leetcode.easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            if(first == null && second == null) {
                continue;
            }
            else if (first == null || second == null || first.val != second.val) {
                return false;
            }
            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        }
        return true;
    }
    public boolean isSameTreeDPS(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        boolean left = isSameTreeDPS(p.left, q.left);
        boolean right = isSameTreeDPS(p.right, q.right);
        return left && right;
    }

}