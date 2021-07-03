package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tip12Test {
    @Autowired
    private Tip12 tip12;

    @Test
    void findMaxLength() {
        int[] nums = {};
        int maxLength = tip12.findMaxLength(nums);
        System.out.println();

    }
}