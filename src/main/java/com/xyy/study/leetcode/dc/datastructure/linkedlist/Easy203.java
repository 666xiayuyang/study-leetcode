package com.xyy.study.leetcode.dc.datastructure.linkedlist;

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

    // 定义一个虚拟头节点,遇到需要移除的元素,就把pre.next = cur.next
    // 如果是不需要移除的元素,就把pre移动到下一个节点
    // 最后返回虚拟节点的头节点
    public ListNode removeElements(ListNode head, int val) {
        // 有可能删除头节点,所以设置newHead为虚拟头节点
        ListNode newHead = new ListNode(0, head);
        ListNode pre = newHead;
        // 遍历的当前位置
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                // 如果为目标值,即将当前值的前一个节点的指针指向当前值的后一个节点
                pre.next = cur.next;
            } else {
                // 更改当前节点的前一个节点为当前值
                pre = cur;
            }
            // 当前节点改为当前节点的下一个值
            cur = cur.next;
        }
        // 因为虚拟节点next才为头节点,所以返回newHead.next
        return newHead.next;
    }
}
