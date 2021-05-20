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
        int[] nums = {1, 2, 3, 4, 5};
        tip1.twoSum(nums, 2);
    }
}