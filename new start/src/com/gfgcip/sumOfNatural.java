package com.gfgcip;

import java.util.Scanner;

public class sumOfNatural {
    public static int SumOfNat(int n){
        int ans = n*n+1/2;
        return ans;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfNat(n));
    }
}
