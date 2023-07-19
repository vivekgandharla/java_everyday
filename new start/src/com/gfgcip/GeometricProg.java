package com.gfgcip;

import java.util.Scanner;

public class GeometricProg {
    public static int Nth_term(int a , int r , int n ){
        int ans = a*(int)Math.pow(r,n-1);
        return ans;

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt(); //common ratio
        System.out.println(Nth_term(a,r,n));
    }

}
