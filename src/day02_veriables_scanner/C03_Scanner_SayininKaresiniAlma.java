package day02_veriables_scanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {

    public static void main(String[] args) {

      // Kullanicidan bir tamsayi isteyip
      // sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tamsayi giriniz...");

        int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayinin karesi : " +  girilenSayi*girilenSayi);


    }
}
