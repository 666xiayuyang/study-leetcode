package com.xyy.study.leetcode.dc.algorithm.binargsearch;

/**
 * 162.寻找峰值
 * 峰值元素是指其值严格大于左右相邻值的元素。
 * 给你一个整数数组  nums，找到峰值元素并返回其索引。数组可能包含多个峰值，
 * 在这种情况下，返回 任何一个峰值 所在位置即可。
 * 你可以假设  nums[-1] = nums[n] = -∞ 。
 *
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 *
 * @author Xyy
 * @create 2023-05-10 11:03
 */
public class Mid162 {

    /**
     * 解法一：最大值肯定为峰值
     */
    public int findPeakElement(int[] nums) {
        int maxi = 0;
        // 注意从遍历从1开始
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    /**
     * 解法二：二分查找。
     * 如果某个值大于它的下一个值,那么峰值一定在它的左边区间
     * 如果某个值小于它的下一个值,那么峰值一定在它的右边区间
     */
    public int findPeakElement2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
