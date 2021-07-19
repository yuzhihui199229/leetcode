package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Solution566Test {
    @Autowired
    private Solution566 solution566;

    @Test
    void matrixReshape() {
        int[][] a={{1, 2, 3, 4}};
        solution566.matrixReshape(a, 2, 2);
    }
}