package Day03_Scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz ...");

        int sayi1 = scanner.nextInt();

        System.out.println(" Lutfen 2. sayiyi girniz ...");

        int sayi2 = scanner.nextInt();

        int temp = 0;



        temp = sayi1 ;

        sayi1 = sayi2 ;

        sayi2 = temp ;

        System.out.println("sayilarin yerini degistirdim" + "\nsayi1: "+ sayi1 + "\nsayi2 :"+ sayi2 + " oldu.");




    }
}
