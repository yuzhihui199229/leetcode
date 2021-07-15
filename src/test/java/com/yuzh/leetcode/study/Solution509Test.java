package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution509Test {
@Autowired
private Solution509 solution509;

    @Test
    void fib() {
        int fib = solution509.fib(13);
    }
}