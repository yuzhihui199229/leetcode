package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution557Test {
    @Autowired
    private Solution557 solution557;

    @Test
    void reverseWords() {
        String s = "Let's take LeetCode contest";
        String s1 = solution557.reverseWords(s);
        assertEquals("s'teL ekat edoCteeL tsetnoc", s1);
    }
}