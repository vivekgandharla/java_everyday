package com.gfgcip;

public class Operators {
    public static void main(String[]args){
        int x = 10, y = 20;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(y/x);
        int z = (x+y*10);
        System.out.println(z);
        z=x++;
        System.out.println(z+" "+ x);
        z=++x;
        System.out.println(z+" "+x  );
        //Assignment Operators
        x+= y;
        System.out.println(x);
        x%=y;
        System.out.println(x);
        z=x=y;
        System.out.println(z); //assosiativity is from right to left


    }
}
