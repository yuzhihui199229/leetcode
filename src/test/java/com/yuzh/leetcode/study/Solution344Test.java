package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution344Test {
    @Autowired
    private Solution344 solution344;

    @Test
    void reverseString() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution344.reverseString(s);
    }
}