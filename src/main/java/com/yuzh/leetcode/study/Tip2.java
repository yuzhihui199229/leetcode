package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *
 *
 * 提示：
 *
 * -231 <= x <= 231 - 1
 */
@Component
public class Tip2 {
    public int reverse(int x) {
        String s = x + "";
        int i=0;
        StringBuilder sb=null;
        if (s.startsWith("-")) {
            String head = s.substring(0, 1);
            String tail = s.substring(1);
            sb = new StringBuilder(tail);
            sb.reverse();
            String finStr = head + sb.toString();
            i = Integer.parseInt(finStr);
        } else {
            sb = new StringBuilder(s);
            sb.reverse();
            i = Integer.parseInt(sb.toString());
        }
        return i;
    }
}
