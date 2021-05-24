package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
@Component
public class Tip4 {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if (strs.length == 1) {
            return s = strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(strs[0].substring(0, i + 1))) {
                    if (j == strs.length - 1) {
                        s = strs[0].substring(0, i + 1);
                    }
                } else {
                    break;
                }
            }
        }
        return s;
    }


    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (s.length() == 0) return "";
                //公共前缀不匹配就让它变短！
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

}
