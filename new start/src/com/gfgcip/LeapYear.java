package com.gfgcip;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0&&n%100!=0){
            System.out.println("yes its a LEAP year");
        }
        else if (n%400==0){
            System.out.println("yes its a LEAP year");


        }else System.out.println("nope");
    }
}
