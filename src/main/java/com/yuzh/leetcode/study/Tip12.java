package com.yuzh.leetcode.study;

import com.jayway.jsonpath.internal.function.text.Length;
import org.springframework.stereotype.Component;

/**
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量0和1的最长连续子数组。
 * 示例 2:
 * <p>
 * 输入: nums = [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。
 */
@Component
public class Tip12 {
    public int findMaxLength(int[] nums) {
        int[] arr = null;
        for (int i = 0; i < nums.length; i++) {
            arr = new int[nums.length - i];
            for (int j = 0; j < nums.length; j++) {
                if (nums.length - i + j <= nums.length) {
                    System.arraycopy(nums, j, arr, 0, nums.length - i);
                    int a=0,b=0;
                    for (int i1 : arr) {
                        if (i1 == 0) {
                            a += 1;
                        } else {
                            b += 1;
                        }
                    }
                    if (a == b)
                        return arr.length;
                } else {
                    break;
                }
            }
        }
        return 0;
    }
}
