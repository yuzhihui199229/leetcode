package com.yuzh.leetcode.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tip1Test {
    @Autowired
    private Tip1 tip1;

    @Test
    @DisplayName("两数之和")
    void twoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = tip1.twoSum(nums, target);
        int[] expect = {0, 1};
        assertArrayEquals(expect,ints);
    }

    @Test
    @DisplayName("两数之和1")
    void twoSum1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = tip1.twoSum1(nums, target);
        int[] expect = {1, 0};
        assertArrayEquals(expect,ints);
    }
}