package Day03_Scanner_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 130;
        int sayi3 = 140;
        int sayi4 = 250;
        int sayi5 = 520;
        int sayi6 = 780;

        double dbl = 24.5;

        int sayi =(int) dbl ;

        System.out.println("24.5'i integer'a cast edersek : " + sayi);
        //24.5'i iteger a cast edersek  : 24

        byte byt = (byte)sayi1 ;

        System.out.println("20'i byte'a cast edersek : " + byt);
        // 20' byte cast edersek : 20


        byt = (byte)sayi2;

        System.out.println("130' u byte cast edersek : " + byt);
        //130' byte a cast edersek : -126

















    }
}
