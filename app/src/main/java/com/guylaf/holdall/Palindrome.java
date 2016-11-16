package com.guylaf.holdall;

/**
 * Created by guyla on 16/11/2016.
 */

public class Palindrome {

    public String Inverse(String mot)

    {
        //String mot = "Langage Java";
        StringBuffer motInverse = new StringBuffer("");
        int lg = mot.length();

        for (int j = lg - 1; j >= 0; j--) {
            motInverse.append(mot.charAt(j));
        }
        return motInverse.toString();
    }
    public Boolean Palindrome(String mot)

    {
        //String mot = "laval";
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
