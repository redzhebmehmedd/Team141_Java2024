package day02_veriables_scanner;

import java.util.Scanner;

public class C05_Scanner_DikdorgenAlan_Hesabi {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdortgenin kenar uzunluklarini giriniz . .  .");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar1*kenar2);



    }
}
