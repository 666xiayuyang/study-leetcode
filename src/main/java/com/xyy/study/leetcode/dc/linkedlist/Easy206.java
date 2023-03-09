package com.xyy.study.leetcode.dc.linkedlist;

/**
 * @author Xyy
 * @create 2023-03-08 16:19
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class Easy206 {
    public ListNode reverseList(ListNode head) {
        // 在遍历链表时，将当前节点的next指针改为指向前一个节点。
        // 由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
        // 在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
        ListNode cur = null;
        ListNode pre = head;
        while (pre != null) {
            ListNode next = pre.next;
            pre.next = cur;
            cur = pre;
            pre = next;
        }
        return cur;
    }
}
