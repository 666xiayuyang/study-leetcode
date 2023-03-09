package com.xyy.study.leetcode.dc.linkedlist;

import java.util.List;

/**
 * @author Xyy
 * @create 2023-03-07 15:29
 *
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，
 * 并返回 新的头节点 。
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 */
public class Easy203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode tem = new ListNode();
        tem.next = head;
        ListNode newHead = tem;
        while (newHead.next != null) {
            if (newHead.next.val != val) {
                newHead = newHead.next;
            } else {
                newHead.next = newHead.next.next;
            }
        }
        return tem.next;
    }
}
