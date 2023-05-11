package com.xyy.study.leetcode.dc.algorithm.binargsearch;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * @author Xyy
 * @create 2023-05-10 09:23
 */
public class Easy704 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int i;
        while (low <= high) {
            // 二分法直接取中间值,小于目标值即选右半部分,大于目标值即选左半部分
            // (low + high) / 2：如果两个值是int类型最大值相加就溢出了
            // 如果使用left + （high - low）/2 求均值不会溢出
            i = (low + high) / 2;
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                // target在mid右边的时候，low = mid + 1
                low = i + 1;
            } else {
                // target在mid右边的时候，low = mid + 1
                high = i - 1;
            }
        }
        return -1;
    }
}
