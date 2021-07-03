package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Tip9Test {

    @Autowired
    private Tip9 tip9;

    @Test
    void lengthOfLastWord() {
//        StopWatch stopWatch=new StopWatch();
        String s = "Hello World";
//        int len = tip9.lengthOfLastWord(s);
        int len1 = tip9.lengthOfLastWord1(s);
//        assertEquals(5,len);
        assertEquals(5,len1);
    }
}