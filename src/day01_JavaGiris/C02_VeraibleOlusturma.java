package day01_JavaGiris;

public class C02_VeraibleOlusturma {

    public static void main(String[] args) {


        int sayi = 10 ;


        // Javadaki = isareti , matematiktekinden farkli calisir

        // Java = isareti gorunce , once esitligin sag tarafindaki degeri hesaplar

        // bulunan islem sonucunu , sol tarafindaki verianle` atar

        sayi = 2 * sayi ;

        System.out.println( sayi); // 20

        sayi = 5 + sayi ;

        System.out.println( sayi ); //

        // 2 * sayi + 1 = 5 * sayi - 7; Veriable expected

        // esitligin sol tarafinda islem olmaz ,  sadece Veriable ismi olmalidir

        sayi = 5 * sayi - 7 ;

        // int sayi = 20 // Veriable `sayi`is already defined in the scope


        System.out.println( sayi );







    }
}
