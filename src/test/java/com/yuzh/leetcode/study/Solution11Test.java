package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution11Test {
    @Autowired
    private Solution11 solution11;

    @Test
    void maxArea() {
        int[] i = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] i = {1,1};
        int i1 = solution11.maxArea(i);
        assertEquals(49,i1);
    }

    @Test
    void maxArea1() {
        int[] i = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] i = {1,1};
        int i1 = solution11.maxArea1(i);
        assertEquals(49,i1);
    }
}