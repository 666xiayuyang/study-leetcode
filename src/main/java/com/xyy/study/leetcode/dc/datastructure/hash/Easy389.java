package com.xyy.study.leetcode.dc.datastructure.hash;

/**
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * @author Xyy
 * @create 2023-05-06 09:32
 */
public class Easy389 {
    public static void main(String[] args) {
        System.out.println(0-'a');
    }

    public char findTheDifference(String s, String t) {

        int[] target = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            target[ch-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            target[ch-'a']--;
            if (target[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';

    }
}
