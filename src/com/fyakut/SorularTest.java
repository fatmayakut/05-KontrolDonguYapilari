package com.fyakut;

import java.util.Scanner;

public class SorularTest {
    public static void main(String... args){

        /**
         * klavyeden girilen 3 sayının ortalamasını veren algorıtmayı yazınız
          */
  /*      System.out.println("birinci sayıyı giriniz");
        Scanner sayiAl=new Scanner(System.in);
        int sayi1=sayiAl.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2=sayiAl.nextInt();
        System.out.println("3 sayıyı giriniz");
        int sayi3=sayiAl.nextInt();
        int toplam=sayi1+sayi2+sayi3;
        int ortalama=toplam/3;
        System.out.println("ortalama:"+ortalama);
*/
        /**
         * klavyeden kenar değerleri verilen bir üçgenin çeşidini veren algoritmayı yazınız
         */

/*
        System.out.println("birinci kenarı giriniz");
        Scanner kenarAl=new Scanner(System.in);
        int kenar1=kenarAl.nextInt();
        System.out.println("ikinci kenarı giriniz");

        int kenar2=kenarAl.nextInt();
        System.out.println("üçüncü kenarı giriniz");
        int kenar3=kenarAl.nextInt();
        if(kenar1==kenar2 && kenar1==kenar3)
            System.out.println(",eşkenar üçgen");
        else if (kenar1==kenar2 || kenar1==kenar3 ||kenar2==kenar3)
            System.out.println("ikizkenar üçgen");
        else
        System.out.println("çeşitkenar üçgen");*/

        /**
         * klavyeden girilen öğrenci notlarına göre geçip geçmediğini veren bir algoritma yazınız(gecme notu=50 vizenin %40 finalin %60
         */
/*
        System.out.println("vize notunu gir");
Scanner notAl=new Scanner(System.in);
int vize=notAl.nextInt();
        System.out.println("final notunu gir");
        int finalnotu =notAl.nextInt();
   int   ortlamanotu=(vize*40/100)+(finalnotu*60/100);
   if (ortlamanotu<50)
       System.out.println("geçmedi"+ortlamanotu);
   else
       System.out.println("geçti"+ortlamanotu);
*/


/**
 * kendi adımızı ekrana beş defa yazdıran algorıtma
 */
/*
String adim="fatma";
for (int i=0;i<5;i++)
    System.out.println("fatma");

*/

/**
 * 1 den 100 kadar olan sayıların toplamını bulan algorıtmayı yazınız
 *
 */
/*int toplam=0;
for (int i=0; i<100;i++)
    toplam=toplam+i;
        System.out.println("toplam:"+toplam);*/

/**
 * 1den 100 e 100 den 1 e olan sayıları sırası ile yazdırın
 *
 */
/*for (int i=1; i<=100; i++){
    for (int j=100; j>0;j--){
        System.out.println("i:"+i+"j:"+j);
    }
}*/

/**
 * klavyeden girilen bir sayının faktoriyelini alan algorıtmayı yazınız
 *
 */
   /*     System.out.println("sayıyı giriniz");
        Scanner sayiAl=new Scanner(System.in);
        int sayi=sayiAl.nextInt();
        int    faktoriyel=1;
      for(int i=sayi;i>0;i--){
           faktoriyel=faktoriyel*i;
      }
        System.out.println("faktoriyel:"+faktoriyel);*/

   /**
    * 100 lük sistemde olan notları harfli sistemde gösteren bir uygulama
    */
/*
        System.out.println("Not giriniz");
        Scanner notAl=new Scanner(System.in);
        int not=notAl.nextInt();
int harfsayisi=4;
     switch (harfsayisi) {
         case 1:
             if (not > 90 && not < 100)
                 System.out.println("aa:" + not);break;
         case 2:
             if (not > 80 && not < 90)
                 System.out.println("bb:" + not);break;
         case 3:
             if (not > 70 && not < 80)
                 System.out.println("cc:" + not);break;
         case 4:
             if (not >0&& not < 70)
                 System.out.println("ff:" + not);break;
     }*/
    }
}
