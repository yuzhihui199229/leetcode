package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0
 */
@Component
public class Tip9 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return 0;
        } else {
            String str = strs[strs.length - 1];
            return str.length();
        }
    }

    public int lengthOfLastWord1(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}
