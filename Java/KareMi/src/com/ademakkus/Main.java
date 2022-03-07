package com.ademakkus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A,B,C,D;
        //A kenarı
        System.out.print("A=");
        A=scanner.nextInt();
        //B kenarı
        System.out.print("B=");
        B=scanner.nextInt();
        //C kenarı
        System.out.print("C=");
        C=scanner.nextInt();
        //D kenarı
        System.out.print("D=");
        D=scanner.nextInt();
        if(A==B &&B==C &&C==D)
            System.out.println("Şekil bir karedir.");
        else
            System.out.println("Şekil kare DEĞİLDİR.");
    }
}
