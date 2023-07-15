package com.gfgcip;
import java.util.Scanner;

class input {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String s = sc.nextLine();
        System.out.println("you entered string"+s);
        int x = sc.nextInt();
        System.out.println("You entered Integar"+x);
        float f = sc.nextFloat();
        System.out.println("You entered float"+f);
    }
}
