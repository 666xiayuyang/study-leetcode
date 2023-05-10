package com.xyy.study.leetcode.dc.datastructure.tree;

/**
 * @author Xyy
 * @create 2023-05-08 09:01
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
