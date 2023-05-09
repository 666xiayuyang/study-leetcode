package com.xyy.study.leetcode.dc.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 后序 遍历。
 * 后序遍历:按照访问左子树——右子树——根节点的方式遍历
 * @author Xyy
 * @create 2023-05-08 09:32
 */
public class Easy145 {

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
        preorder(root.left, res);
        preorder(root.right, res);
        res.add(root.val);
    }
}
