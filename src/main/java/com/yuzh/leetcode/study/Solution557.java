package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 557. 反转字符串中的单词 III
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
@Component
public class Solution557 {
    public String reverseWords(String s) {
        StringBuffer sbto = new StringBuffer();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s1[i]);
            sb.reverse();
            if (i < s1.length - 1)
                sb.append(" ");
            sbto.append(sb);
        }
        return sbto.toString();
    }
}