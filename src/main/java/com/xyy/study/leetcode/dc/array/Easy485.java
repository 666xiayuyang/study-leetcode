package com.xyy.study.leetcode.dc.array;

import java.util.Map;

/**
 * @author Xyy
 * @create 2023-03-07 14:47
 *
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 * 输入：nums = [1,1,0,1,1,1]
 * 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 */
@SuppressWarnings("all")
public class Easy485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // 定一个中间变量,记录计数过程中的count
        int maxCount = 0; int tem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tem++;
            } else {
                // 中断的时候取较大值,清空中间变量
                maxCount = Math.max(maxCount, tem);
                tem = 0;
            }
        }
        // 注意最后一次还需要比较大小,因为有可能最后一段连续1的个数最多
        return Math.max(maxCount, tem);
    }
}
