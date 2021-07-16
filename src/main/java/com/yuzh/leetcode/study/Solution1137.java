package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 1137. 第 N 个泰波那契数
 * <p>
 * 泰波那契序列 Tn 定义如下：
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * <p>
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 示例 2：
 * <p>
 * 输入：n = 25
 * 输出：1389537
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= n <= 37
 * 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 */
@Component
class Solution1137 {
    public int tribonacci(int n) {
        if (n < 3)
            return n == 0 ? 0 : 1;
        int temp, x = 0, y = 1, z = 1;
        for (int i = 3; i <= n; i++) {
            temp=x+y+z;
            x=y;
            y=z;
            z=temp;
        }
        return z;
    }
}