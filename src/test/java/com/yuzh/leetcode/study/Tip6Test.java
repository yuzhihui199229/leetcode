package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip6Test {

    @Autowired
    private Tip6 tip6;

    @Test
    void strStr() {
//        String haystack = "hello", needle = "ll";
//        String haystack = "aaaaa", needle = "bba";
        String haystack = "", needle = "";
        int i = tip6.strStr(haystack, needle);
        assertEquals(0, i);
    }
}