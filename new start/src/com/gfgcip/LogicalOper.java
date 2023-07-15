package com.gfgcip;

import java.util.Scanner;

public class LogicalOper {
    public static void main(String[]args){
        //Logical operators
        System.out.println("Enter your username and password");
        String user = "Vivek", pwd = "123";
        Scanner sc = new Scanner(System.in);
        String iu = sc.nextLine();
        String ip = sc.nextLine();
        if(user.equals(iu)&&pwd.equals(ip)){
            System.out.println("Welcome");
        }else System.out.println("Try again");
    }
}

