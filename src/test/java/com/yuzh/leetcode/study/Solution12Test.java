package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution12Test {
@Autowired
private Solution12 solution12;

    @Test
    void intToRoman() {
    }

    @Test
    void intToRoman1() {
        String s = solution12.intToRoman1(3);
        assertEquals("III",s);
    }
}