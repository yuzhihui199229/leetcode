package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * -231 <= x <= 231 - 1
 */
@Component
public class Tip2 {
    /**
     * 自己的解法
     * @param x
     * @return
     */
    public int reverse(int x) {
        String s = x + "";
        int i = 0;

        StringBuilder sb = null;
        String finStr = null;
        if (s.startsWith("-")) {
            String head = s.substring(0, 1);
            String tail = s.substring(1);
            sb = new StringBuilder(tail);
            sb.reverse();
            finStr = head + sb.toString();
        } else {
            sb = new StringBuilder(s);
            finStr = sb.reverse().toString();
        }
        try {
            i = Integer.parseInt(finStr);
        } catch (Exception e) {
            i = 0;
            e.printStackTrace();
        } finally {
            return i;
        }
    }

    /**
     * 最佳的解法
     * @param x
     * @return
     */
    public int reverse1(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
