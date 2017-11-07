package com.fyakut;

public class IFelseSwitch {
    /**
     * koşulu sağlayan if dongusu çalışır.true olan yani. sağlamayana girmez.
     *
     */
    public static void main(String[] args) {
	/*int birinciSayi=7;
	int ikinciSayi=8;
	if (birinciSayi<ikinciSayi){
        System.out.println("birinci sayı 2 sayıdan küçüktür");

    }
    if (birinciSayi>ikinciSayi){
        System.out.println("birinci sayı 2 sayıdan büyüktür");

    }
    if (birinciSayi!=ikinciSayi){
        System.out.println("birinci sayı 2 sayıya eşit değildir");

    }*/
	/*int yas=20;
	int dogmtarihi=1990;
	if (yas==20 && dogmtarihi==1990){
        System.out.println("tatamı doğru olmalı");
    }
        if (yas==25 || dogmtarihi==1990){
            System.out.println("herhangi biri doğru olabilir");
        }*/
	/*//if-else
        int s1=8;
        int s2=6;
        if (s1<s2){
            System.out.println("s1 s2den küçüktür");
        }else if(s1>s2) {
            System.out.println("s1 s2den büyüktür");
        }else{
            System.out.println("s1 s2 ye eşittir");
    }*/
	//if-then else
      //  ifade ?  sorgu 1: sorgu2
      /*  int a1=3; int a2=5;
        System.out.println((a1<a2)? a1:a2);
        System.out.println((a1<a2)? "a1"+a1:"a2"+a2);*/
int gunsırası=5;
switch (gunsırası){
    case 1:
        System.out.println("1. gun pazartesi");
        break;
    case 2:System.out.println("2. gun sali");
        break;
    case 3:   System.out.println("3. gun çarşamba");
        break;
    case 4:  System.out.println("4. gun perşembe");
        break;
    case 5:   System.out.println("5. gun cuma");
        break;
    case 6:System.out.println("6. gun cumartesi");
        break;
    case 7:   System.out.println("7. gun pazar");
        break;
        default:System.out.println("boyle bir gun yok");break;
}

    }
}
