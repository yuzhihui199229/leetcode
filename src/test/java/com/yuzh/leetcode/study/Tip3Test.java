package com.yuzh.leetcode.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip3Test {

    @Autowired
    private Tip3 tip3;

    @Test
    @DisplayName("回文数")
    void isPalindrome() {
        boolean palindrome = tip3.isPalindrome(-121);
        assertEquals(false,palindrome);
    }

    @Test
    @DisplayName("回文数1")
    void isPalindrome1() {
        boolean palindrome = tip3.isPalindrome1(-121);
        assertEquals(false,palindrome);
    }
}