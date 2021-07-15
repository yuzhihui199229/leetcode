package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution189Test {
@Autowired
private Solution189 solution189;

    @Test
    void rotate() {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        solution189.rotate(nums,k);
    }
}