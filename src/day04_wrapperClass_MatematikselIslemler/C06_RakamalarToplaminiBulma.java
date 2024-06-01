package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;
import java.util.SortedMap;

public class C06_RakamalarToplaminiBulma {

    public static void main(String[] args) {

        //Kullanicidan 3 basamakli bir sayi isteyip

        // sayinin rakmalar toplamini bulun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamakli bir tamsayi giriniz ...");

        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0 ;
        int rakamtoplami = 0 ;

        birlerBasamagi = sayi % 10 ;
        rakamtoplami = rakamtoplami + birlerBasamagi ;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamtoplami = rakamtoplami + birlerBasamagi ;
        sayi = sayi / 10 ;

        rakamtoplami = rakamtoplami + sayi ;

        System.out.println("Girilen" + girilenSayi + "sayinin rakamlar toplami : " + rakamtoplami );


    }
}
