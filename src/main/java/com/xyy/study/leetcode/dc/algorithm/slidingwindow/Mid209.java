package com.xyy.study.leetcode.dc.algorithm.slidingwindow;

/**
 * 209. 长度最小的子数组
 * 给定一个含有n个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * @author Xyy
 * @create 2023-05-11 09:39
 */
public class Mid209 {

    /**
     * 方法一：暴力法（超时）。依次找到每个数组下标中符合条件的子数组长度,并比较,找出最小值
     */
    public static int minSubArrayLen(int target, int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        // 假设数据为最长的
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            // j注意从i开始,即从数据下标开始
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[i];
                if (sum >= target) {
                    // min = j - i + 1
                    min = Math.min(min, j - i +1);
                    break;
                }
            }
        }
        // 如果min没有修改,则证明不存在
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /**
     * 方法二：滑动窗口。定义两个指针,都从0开始,让右指针向右移动,并比较该区间和target大小。
     *  当区间内sum >= target 时,记录此时的区间大小,并将左指针左移1位,继续和target比较
     *  循环到最后一位时,如果刚好最后一位比较大,此时会在第二个while中一直循环
     */
    public static int minSubArrayLen2(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (r < nums.length){
            sum = sum + nums[r];
            // 注意这里是while,因为如果大于target后,还需要左移l,再判断是否还大于target
            while (sum >= target) {
                min = Math.min(min ,r - l + 1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
