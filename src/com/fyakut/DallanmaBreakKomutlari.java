package com.fyakut;

/**
 * iç içe for dongüleri
 */
public class DallanmaBreakKomutlari {
    public static void main(String... args){
       /* for (int i=0; i<10; i++){
            if (i==5)
                break;
            System.out.println(i);//i 5 e eşit olduğunda döngüden çık ve i ye 5 yazdır
//        }*/
//etiket:
//       for (int i=0;i<10; i++){
//           for (int j=0; j<5; j++){
//               if (j==2)
//                   break etiket;//for a etiket bırakma işlemi
//               System.out.println("i:"+i+"j:"+j);
//           }
//       }
       /* for (int i=0;i<10; i++){
            if (i==2)
                continue;//i=2 olduğunda sadece 2 durumunda çalışma demek oluyor
            System.out.println(i);
        }*/


/*etiket:
       for (int i=0;i<10; i++){
           for (int j=0; j<5; j++){
               if (j==2)
                  continue etiket;//for a etiket bırakma işlemi
               System.out.println("i:"+i+"j:"+j);
           }
       }*/

for (int i=0;i<10;i++){
    if(i==5)
        return;//return i=5 olduğunda donguden tek değil metoddan çıkar. break donguden çıkar.
    System.out.println(i);
}

    }
}
