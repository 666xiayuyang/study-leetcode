package com.xyy.study.leetcode.dc.datastructure.array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @author Xyy
 * @create 2023-03-07 14:00
 */
@SuppressWarnings("all")
public class Easy283 {
    public static void main(String[] args) {
        int[] a = {1,3,0,0,12};
        moveZeroes(a);
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            // 将右边不等于0的都换到左边,分界点就为0,且没有打乱顺序
            if (nums[right] != 0) {
                int tem = nums[right];
                nums[right] = nums[left];
                nums[left] = tem;
                left++;
            }
            right++;
        }
    }

}
