package com.fyakut;

/**
 * while-for-do while
 */
public class ForWhileDo {
    public static void main(String... args) {

  /*  *//**
         * while =koşul sağlanana kadar çalıştır demektir
         *//*

    int sayi=1;
    while(sayi<10){
        System.out.println("suanki sayi:"+sayi);//sonsuz çalışır bunun için de sayiya işlem verimeli
        sayi++;
    }

    int s=1; int toplam = 0;
    while (s<=10){
        toplam=toplam+s;
        s++;
        System.out.println("1den 10 olan sayıların toplamı:"+toplam);
    }*/

   /*     *//**
         * do-while fark olarak do nın içi mutlaka çalıştırmalı
         *//*
        int sayi = 1;
        do {

            System.out.println("sayi:" + sayi);
            sayi++;
        } while (sayi <= 10);

*/
        /**
         *
         * for dongusu
         */
        for (int i=10;i<10;i++){//artma eksiltme işleme baglı yapılabilir
            System.out.println("sayi"+i);
        }

        for (int a=5 ,b=6; a*b<100;a++,b+=3){
            System.out.println("anın ilk değeri:"+a);
            System.out.println("bnın ilk değeri:"+b);
            System.out.println("a*b ilk değeri:"+a*b);

        }
    }

}
