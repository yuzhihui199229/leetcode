package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution17Test {
@Autowired
private Solution17 solution17;

    @Test
    void letterCombinations() {
        solution17.letterCombinations("1");
    }

}