package com.gfgcip;

public class output {
    public static void main(String[]args){
        int x = 100, y = 200;
        System.out.format("Value of x is %d\n",x);
        double d = Math.PI;
        System.out.println(d);
        System.out.format("value of pi=%2f\n",d);
        System.out.format("value of pi=%5.2f\n",d);
        System.out.format("value of pi=%05.2f\n",d);
        System.out.printf("x = %d,y = %d",x,y);
    }
}
