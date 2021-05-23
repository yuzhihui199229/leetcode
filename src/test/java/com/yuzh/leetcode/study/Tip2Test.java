package com.yuzh.leetcode.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip2Test {
    @Autowired
    private Tip2 tip2;

    @Test
    @DisplayName("整数反转")
    void reverse() {
        int reverse = tip2.reverse(
                1534236469);
//        System.out.println(reverse);
        assertEquals(0,reverse);
    }

    @Test
    @DisplayName("the best way ")
    void reverse1() {
        int i = tip2.reverse1(1534236469);
        assertEquals(0,i);
    }
}
