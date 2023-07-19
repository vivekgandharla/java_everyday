package com.gfgcip;

import java.util.Scanner;

public class Nth_term_Arithimetic_prog {
    public static int Nth_term(int a, int d , int n){
        final int i = a + (n - 1) * d;
        return i;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Nth_term(a,d,n));

    }

}
