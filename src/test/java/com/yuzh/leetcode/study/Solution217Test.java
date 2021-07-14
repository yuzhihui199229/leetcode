package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution217Test {
@Autowired
private Solution217 solution217;

    @Test
    void containsDuplicate() {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 2, 3, 4};
        boolean b = solution217.containsDuplicate(nums);
        assertEquals(true,b);
    }
}