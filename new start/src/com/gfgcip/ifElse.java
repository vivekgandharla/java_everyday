package com.gfgcip;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        // write your code here
        int x =0, y = 0;
        Scanner sc = new Scanner(System.in);
        char move = sc.next().charAt(0);
        switch (move){
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case  'U':
                y--;
                break;
            case 'D':
                y++;
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
