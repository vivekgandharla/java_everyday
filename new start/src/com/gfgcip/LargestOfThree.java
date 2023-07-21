package com.gfgcip;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if(a>b&&a>c){
//            System.out.println("Largest no is"+a);
//        } else if (b>a&&b>c){
//            System.out.println(b);
//        } else System.out.println(c);
        int ans_1 = Math.max(a,b);
        int ans = Math.max(ans_1,c);
        System.out.println(ans);

    }
}
