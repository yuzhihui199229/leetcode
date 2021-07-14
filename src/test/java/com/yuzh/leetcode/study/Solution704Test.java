package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Solution704Test {
@Autowired
private Solution704 solution704;

    @Test
    void search() {
//        int[] nums ={-1,0,3,5,9,12};
        int[] nums ={-1,0,3,5,9,12};
//        int target=9;
        int target=2;
        int search = solution704.search(nums, target);
        assertEquals(-1,search);
    }

}