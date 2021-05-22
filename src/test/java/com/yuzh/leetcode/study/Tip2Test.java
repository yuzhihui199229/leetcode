package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip2Test {
    @Autowired
    private Tip2 tip2;

    @Test
    void reverse() {
        int reverse = tip2.reverse(-766881);
        assertEquals(-188667,reverse);
    }
}