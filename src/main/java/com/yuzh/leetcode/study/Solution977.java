package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 977. 有序数组的平方
 * <p>
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 */
@Component
class Solution977 {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int num : nums) {
            int a = Math.abs(num);
            list.add(a*a);
        }
        Object[] b = list.stream().sorted().toArray();
        int[] c=new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i]=Integer.parseInt(b[i].toString());
        }
        return c;
    }
}