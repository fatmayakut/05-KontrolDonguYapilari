package com.fyakut;

import java.util.Scanner;

public class KlavyedenGiris {
    public static void main(String... args){
        System.out.println("adınızı yazdırın");
        String isim="";
        Scanner tara=new Scanner(System.in);
        isim=tara.nextLine();

        System.out.println("girilen isim"+isim);
        /**
         * scanner metodları
         * next :klavyeden girilen ilk kelimeyi boşluga kadar alır
         * findInLine(.charAt())=klavyeden girilen ifadeyi belirtilen karektere boler
         * nextInt:klavyeden girilen değeri inte cevirir
         */
    }
}
