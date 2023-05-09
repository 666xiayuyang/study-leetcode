package com.xyy.study.leetcode.dc.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 中序 遍历。
 * 中序遍历:按照访问左子树——根节点——右子树的方式遍历
 * @author Xyy
 * @create 2023-05-08 09:30
 */
public class Easy94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        // 只需要更改下面三行代码的递归顺序即可实现前、中、后序遍历
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
