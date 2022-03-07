package com.ademakkus;

public class Main {

    public static void main(String[] args) {
	    int a=10;
        int b=a++;
        System.out.println("a="+a);
        System.out.println("b="+b);
        int x=10;
        int y=++x;
        System.out.println("x="+x);
        System.out.println("y="+y);

        System.out.println("****************************");
        int m=100;
        int n=m--;
        System.out.println("m="+m);
        System.out.println("n="+n);

        int p=999;
        int r=--p;
        System.out.println("p="+p);
        System.out.println("r="+r);


    }
}
