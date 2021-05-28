package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tip8Test {

    @Autowired
    private Tip8 tip8;

    @Test
    void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int i = tip8.searchInsert(nums, target);
        assertEquals(4,i);
    }
}