package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution13Test {
    @Autowired
    private Solution13 solution13;

    @Test
    void romanToInt() {
//        String s ="III";
//        String s ="IV";
//        String s ="IX";
//        String s ="LVIII";
        String s ="MCMXCIV";
        int i = solution13.romanToInt(s);
//        assertEquals(3,i);
//        assertEquals(4,i);
//        assertEquals(9,i);
//        assertEquals(58,i);
        assertEquals(1994,i);
    }
}