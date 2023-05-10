package com.xyy.study.leetcode.dc.doublepoint;

import java.util.Arrays;

/**
 * 给定数组  people  。people[i]表示第 i  个人的体重  ，船的数量不限，每艘船可以承载的最大重量为  limit。
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为  limit。
 * 返回 承载所有人所需的最小船数  。
 *
 * @author Xyy
 * @create 2023-05-09 09:04
 */
public class Mid881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = people.length;
        int i = 0;
        int j = people.length - 1;
        while (i < j) {
            if (people[i] + people[j] < limit) {
                i++;
                j--;
                res--;
            }else {
                j--;
            }

        }
        return res;
    }
}
