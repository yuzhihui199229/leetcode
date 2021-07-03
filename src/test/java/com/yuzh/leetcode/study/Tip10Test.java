package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip10Test {

    @Autowired
    private Tip10 tip10;

    @Test
    void plusOne() {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        final int[] ints = tip10.plusOne(digits);
    }
}