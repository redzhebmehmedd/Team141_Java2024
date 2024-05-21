package day02_veriables_scanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfiYazdirma {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyip
        // metnin sadece ilk harfini, buyuk harf olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz . . .");

        // önce 2 yöntemle yapacagiz
        // 1 - önce tüm metni alip, sonra ilk harfi yazdiralim

        String metin = scanner.nextLine();
        System.out.println(metin.toUpperCase().charAt(0));
        // kaydetigimiz metni, buyukharfle cevirip, ilk karekter aldik


        // 2. yontem olarak scannerdan sadece metnin ilk harfini alip kaydedelim

        System.out.println(" Lütfen bir mettin daha giriniz . . .");







    }
}
