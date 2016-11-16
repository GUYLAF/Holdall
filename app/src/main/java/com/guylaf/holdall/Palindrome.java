package com.guylaf.holdall;

/**
 * Created by guyla on 16/11/2016.
 */

public class Palindrome {
    public Boolean Palindrome()

    {
        String mot = "laval";
        StringBuffer palindrome = new StringBuffer("");
        int lg = mot.length();

        for (int j = 0; j < (lg-1)/2; j++) {
            if (mot.charAt(j)!= mot.charAt((lg-1)-j))
            {break;
            }
            return true;
        }
        return false;
    }
}
