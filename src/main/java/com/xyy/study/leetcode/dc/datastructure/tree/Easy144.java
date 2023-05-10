package com.xyy.study.leetcode.dc.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * 前序遍历:按照访问根节点——左子树——右子树的方式遍历
 * @author Xyy
 * @create 2023-05-08 09:00
 */
public class Easy144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        // 只需要更改下面三行代码的递归顺序即可实现前、中、后序遍历
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
