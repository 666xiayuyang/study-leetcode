package com.xyy.study.leetcode.dc.datastructure.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 * 如果数组中每个元素互不相同，返回 false 。
 * @author Xyy
 * @create 2023-05-06 09:24
 */
public class Easy217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set =  new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // 注意是 !=,出现两次返回true,即有重复元素返回true
        return set.size() != nums.length;
    }
}
