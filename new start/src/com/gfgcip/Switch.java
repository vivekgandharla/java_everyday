package com.gfgcip;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        int x =0; int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Move");
        char move = sc.next().charAt(0);
        switch (move) {
            case 'L' -> x--;
            case 'R' -> x++;
            case 'U' -> y++;
            case 'D' -> y--;
            default -> System.out.println("Invalid");
        }
    }
}
