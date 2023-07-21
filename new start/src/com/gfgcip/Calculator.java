package com.gfgcip;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operation:\n1.Addition\n2.Substraction\n3.Multipication\n4.Division\n");
        int Operation = sc.nextInt();
        if(Operation!=1&&Operation!=2&&Operation!=3&&Operation!=4){
            System.out.println("Invalid");

        }else {
            System.out.println("Enter the First num:");
            int a = sc.nextInt();
            System.out.println("Enter the Second Num: ");
            int b = sc.nextInt();
        if(Operation==1) {
            System.out.println(a + b);
        }
        else if (Operation == 2) {
                System.out.println(a - b);}
                else if (Operation == 3) {
                    System.out.println(a * b);}
                    if  (Operation == 4) {
                        System.out.println(a / b);
                    }
                }
            }}
