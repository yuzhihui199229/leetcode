package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution121Test {
@Autowired
private Solution121 solution121;

    @Test
    void maxProfit() {
        int[] prices={7,1,5,3,6,4};
        int i = solution121.maxProfit(prices);
        assertEquals(5,i);
    }
}