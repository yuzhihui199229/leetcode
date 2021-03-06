package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
@Component
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int a = -1;
        if (target < nums[0])
            a = 0;
        if (target > nums[nums.length - 1]) {
            a = nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                a = i;
                break;
            }
            if (i + 1 < nums.length) {
                if (target > nums[i] && target < nums[i + 1]) {
                    a = i + 1;
                    break;
                }
            }
        }
        return a;
    }

    public int searchInsert1(int[] nums, int target) {
        int zuo = 0;
        int you = nums.length;
        while (zuo < you) {
            int mid = (zuo + you) / 2;
            if (nums[mid] >= target) {
                you = mid;
            } else {
                zuo = mid + 1;
            }
        }
        return zuo;
    }
}