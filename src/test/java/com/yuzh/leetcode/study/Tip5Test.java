package com.yuzh.leetcode.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tip5Test {

    @Autowired
    private Tip5 tip5;

    @Test
    @DisplayName("删除有序数组中的重复项")
    void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = tip5.removeDuplicates(nums);
        assertEquals(5, i);
    }

    @Test
    @DisplayName("删除有序数组中的重复项1")
    void removeDuplicates1() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = tip5.removeDuplicates1(nums);
        assertEquals(5, i);
    }
}