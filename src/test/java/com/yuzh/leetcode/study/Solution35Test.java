package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution35Test {
    @Autowired
    private Solution35 solution35;

    @Test
    void searchInsert() {
        int[] a={1,3,5,6};
        int target =5;
        int i = solution35.searchInsert(a, target);
        assertEquals(2,i);
    }

    @Test
    void searchInsert1() {
        int[] a={1,3,5,6};
        int target =5;
        int i = solution35.searchInsert1(a, target);
        assertEquals(2,i);
    }
}