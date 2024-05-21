package day02_veriables_scanner;

import java.util.Locale;

public class C01_PrimitiveDataTurleri {

    public static void main(String[] args) {

        char chr1 = '0';

         char chr2 = ' ' ;

        // char chr3 = 'a'; // to many chararecters

        byte byt = 10; // bu hafizada 8 bit yer kaplar
        short in = 10; // bu hafizada 16 bit yer kaplar
        int sayi = 10; // bu hafizada 32 bit yer kaplar
        long lng = 10; // bu hafizada 64 bit yer kaplar


        float flt = 234123123454332f;
        float flt2 = 234F;
        float flt3 = 23.678f;
        double dbl1 = 3.14234323456543432;

        /*
            1- boolean ==> true-false
            2- char ==> tek bir karakter 'a' tek tirnak kullanir
            3-4-5-6 byte,short,int,long ==> tamsayi barindirir
            7-8 float,double ==> ondalikli sayi barindirir
         */

        // primitive data turleri sadece deger barindirir
        // non-primitive data turleri ise deger ve hazir method'lari barindirirlar


        String str = " Java Candir" ;

        System.out.println( str.toUpperCase(Locale.ROOT));

        System.out.println(str.toLowerCase(Locale.ROOT));

        int not = 10;
        int Not = 20;

        // int not = 30; // Veriable 'not' is already defined in scope

        int NOt = 40;
        int NOT = 50;

        System.out.println(Not); // 20


        String isim1$_ = "Eghbal";
        // String 5isim = " Reco ";  Veriable isimleri sayi ile baslamay

        String $isim = "Büsra"; // isimler


    }
}
