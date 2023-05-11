package com.xyy.study.leetcode.dc.algorithm.binargsearch;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * @author Xyy
 * @create 2023-05-10 10:38
 */
public class Easy35 {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        /**
         * 当原数组不包含target时，考虑while循环最后一次执行的总是 left=right=mid,
         * 此时nums[mid] 左边的数全部小于target，nums[mid]右边的数全部大于target,
         * 则此时我们要返回的插入位置分为两种情况：
         * ①就是这个位置，即nums[mid]>target时，此时执行了right=mid-1，返回left正确
         * ②是该位置的右边一个，即nums[mid]<target时，此时执行了left=mid+1,返回left也正确
         */
        return low;
    }
}
