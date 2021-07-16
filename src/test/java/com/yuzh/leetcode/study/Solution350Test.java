package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution350Test {
    @Autowired
    private Solution350 solution350;

    @Test
    void intersect() {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        solution350.intersect(nums1,nums2);
        return;
    }
}