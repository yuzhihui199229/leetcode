package com.yuzh.leetcode.study;

import org.springframework.stereotype.Component;

@Component
public class Tip3 {
    /**
     * 自己的解法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String s = sb.reverse().toString();
        int j;
        try {
            j = Integer.parseInt(s);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if (x == j) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 最佳的解法
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if(x<0)
            return false;
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;
    }
}
