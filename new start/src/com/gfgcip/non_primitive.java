package com.gfgcip;

import java.awt.*;

public class non_primitive {
    int x ;
    int y;

}
class test{
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x =10; p1.y=20;
        System.out.println(p1);
        Point p2 = p1;
        p2.x = 30;
        System.out.println(p1.x);
        System.out.println(p2.x);

    }
}