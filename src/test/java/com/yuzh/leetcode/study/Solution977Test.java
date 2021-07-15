package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution977Test {
@Autowired
private Solution977 solution977;

    @Test
    void sortedSquares() {
        int[] a={-4,-1,0,3,10};
        int[] ints = solution977.sortedSquares(a);
        assertEquals(new int[]{0,1,9,16,100},ints);
    }

}