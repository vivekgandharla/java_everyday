package com.gfgcip;

public class BitwiseOperator {
    public static void main (String[]args){
        int x = 3,y=6;
        System.out.println(x^y); //XOR
        System.out.println(x|y);//OR
        System.out.println(x&y);//AND
        System.out.println(~x);
        //Left shift <<

        System.out.println(x<<2);
        System.out.println(x<<y);
        // Right shift >>
        System.out.println(x>>1);
        //unsigned right sift(>>>)
        System.out.println(-2>>>1);
    }
}
