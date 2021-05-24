package com.yuzh.leetcode.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip4Test {

    @Autowired
    private Tip4 tip4;

    @Test
    @DisplayName("最长公共前缀")
    void longestCommonPrefix() {
        String[] strs = {"flower","flower","flower","flower"};
        String s = tip4.longestCommonPrefix(strs);
        assertEquals("flower",s);
    }

    @Test
    @DisplayName("最长公共前缀")
    void longestCommonPrefix1() {
        String[] strs = {"flower","flower","flower","flower"};
        String s = tip4.longestCommonPrefix1(strs);
        assertEquals("flower",s);
    }
}