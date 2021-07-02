package com.yuzh.leetcode.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Tip15Test {

    @Autowired
    private Tip15 tip15;

    @Test
    void maxIceCream() {
        int[] costs={1,3,2,4,1};
//        int[] costs={10,6,8,7,7,8};
//        int[] costs={1,6,3,1,2,5};
        int i = tip15.maxIceCream(costs, 86159173);
        assertEquals(4,i);
    }
}