package com.xyy.study.leetcode.dc.algorithm.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * 1456. 定长子串中元音的最大数目
 * 给你字符串 s 和整数 k 。
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 * 英文中的 元音字母 为（a, e, i, o, u）。
 * @author Xyy
 * @create 2023-05-11 14:40
 */
public class Mid1456 {
    public static void main(String[] args) {
        String t = "aeiou";
        System.out.println(t.indexOf('b'));

    }

    public static int maxVowels(String s, int k) {
        if (s.length() == 0) {
            return 0;
        }
        int res = 0;
        int count = 0;
        int l = 0;
        int r = 0;
        List<Character> characters = new ArrayList<Character>(){};
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('o');
        characters.add('u');
        while (r < s.length()) {
            while (characters.contains(s.charAt(r))) {
                count++;
                res = Math.max(count,  res);
                r++;
                if (r >= s.length()) {
                    break;
                }
            }
            count = 0;
            r++;
        }
        return Math.min(res, k);
    }

    public static int maxVowels2(String s, int k) {
        if (s.length() == 0) {
            return 0;
        }
        int res = 0;
        int count = 0;
        int l = 0;
        int r = 0;

        return 9;
    }
}
