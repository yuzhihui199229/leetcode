package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 283. 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
@Component
class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums==null)
            return;
        int len=nums.length;
        int j=0;
        for (int i = 0; i < len; i++) {
            if (nums[i]!=0)
                nums[j++]=nums[i];
        }

        for (int i = j; i < len; i++) {
            nums[i]=0;
        }
    }
}