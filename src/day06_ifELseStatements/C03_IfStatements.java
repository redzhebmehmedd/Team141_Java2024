package day06_ifELseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        // soru 3 - kullanican bir sayi alin,

        //sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        //sayi 5 ile bolunebbiliyorsa "bes ile bolune bilen sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz...");
        int girilensayi = scanner.nextInt();


        if (girilensayi % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");

        }

        if (girilensayi % 5 == 0) {
            System.out.println("bes ile bolunebilen sayi");

        }
    }
}
