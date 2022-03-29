package com.ademakkus;

import java.util.List;
import java.util.Scanner;

public class Personel {
    int sicilNo;
String adsoyad;
double maas;

    public Personel(List<Personel> personeller) {
        this.personeller = personeller;
    }

    List<Personel> personeller;
    public Personel() {
    }

    public Personel(int sicilNo, String adsoyad, double maas) {
        this.sicilNo = sicilNo;
        this.adsoyad = adsoyad;
        this.maas = maas;

    }

    void ekle(){
        Personel p=new Personel();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Personel Ekleme");
        System.out.print("Sicil No (int) =");
        p.sicilNo=scanner.nextInt();
        System.out.print("Ad Soyad =");
        p.adsoyad=scanner.next();
        System.out.print("Maaş (double) =");
        p.maas=scanner.nextDouble();
        personeller.add(p);
        yazdir();
    }
    void yazdir( ){
        for (Personel person:
             personeller) {
            System.out.println("Sicil No:"+sicilNo+" Ad soyad:"+adsoyad+" maaş:"+maas);

        }
    }
    void arama(int sicilNo){
        for (Personel p:
             personeller) {
            if(p.sicilNo==sicilNo){
                System.out.println("Sicil No:"+p.sicilNo+" Ad soyad:"+p.adsoyad+" maaş:"+p.maas);
            }

        }
    }
    void arama(String adsoyadyad){
        for (Personel p:
             personeller) {
            if(p.adsoyad==adsoyad){
                System.out.println("Sicil No:"+p.sicilNo+" Ad soyad:"+p.adsoyad+" maaş:"+p.maas);
            }

        }
    }
void listele(){

}
}
