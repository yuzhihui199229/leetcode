package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 11. 盛最多水的容器
 * <p>
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例 2：
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 * 示例 4：
 * <p>
 * 输入：height = [1,2,1]
 * 输出：2
 * <p>
 * <p>
 * 提示：
 * <p>
 * n = height.length
 * 2 <= n <= 3 * 104
 * 0 <= height[i] <= 3 * 104
 */
@Component
class Solution11 {
    /*超时*/
    public int maxArea(int[] height) {
        int maxArea=0;
        for (int i = 0; i < height.length; i++) {
            int maxAreaTemp = 0;
            for (int i1 = i+1; i1 < height.length; i1++) {
                int area = Math.abs(i - i1) * (height[i] <= height[i1] ? height[i] : height[i1]);
                if (area > maxAreaTemp)
                    maxAreaTemp = area;
            }
            if (maxAreaTemp>maxArea)
                maxArea=maxAreaTemp;
        }
        return maxArea;
    }

    public int maxArea1(int[] height) {
        int l=0,r=height.length-1;
        int ans =0;
        while (l < r) {
            int area=Math.min(height[l],height[r])*(r-l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}