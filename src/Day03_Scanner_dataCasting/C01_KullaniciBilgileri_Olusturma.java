package Day03_Scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileri_Olusturma {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz .. .");

        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz ..." );

        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi girin ...");

        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim + "Soyisminiz :" + soyisim + "Yasiniz : "  + yas + "Kaydiniz basari ile Tamamlanmistir");


    }
}
