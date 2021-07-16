package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution167Test {
    @Autowired
    private Solution167 solution167;

    @Test
    void twoSum() {
//        int[] nums={2,7,11,15};
//        int target=9;
        int[] nums={2,3,4};
        int target=6;
        int[] ints = solution167.twoSum(nums, target);
        return;
    }
}