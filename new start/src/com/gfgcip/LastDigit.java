package com.gfgcip;

import java.util.Scanner;

public class LastDigit {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = Math.abs(n);
        int ans = n%10;

        System.out.println(ans);
    }
}
