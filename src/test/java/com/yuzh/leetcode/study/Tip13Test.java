package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip13Test {

    @Autowired
    private Tip13 tip13;

    @Test
    void singleNumber() {
        int[] nums = {2,2,1};
        int i = tip13.singleNumber(nums);
        assertEquals(1, i);
    }
}