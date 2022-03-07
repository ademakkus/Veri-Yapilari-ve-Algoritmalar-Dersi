package com.ademakkus;

public class Main {

    public static void main(String[] args) {
        int a=3,b=8,c=24,d;
        d=a*4+b/4*(a-1);
        System.out.println(d++);
        c-=d-a+b%3;
        System.out.println( --c);
        System.out.println(c*a-d);

    }
}
