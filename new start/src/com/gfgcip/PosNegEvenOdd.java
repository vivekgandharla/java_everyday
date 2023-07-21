package com.gfgcip;

import java.util.Scanner;

public class PosNegEvenOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>0){
            System.out.print("Positive ");
            if(n%2==0){
                System.out.println("even");
            }else System.out.println("Odd");
        } if(n<0){
            System.out.print("Negative");
            if(n%2==0){
                System.out.println("Even");

            }else System.out.println("Odd");
        }

    }
}
