package day06_ifELseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

        /*
        Bagimsiz if cümleleri,
        adindan anlasilacagi gibi kodun geriye kanalanindan bagimsizdir

        sart'a odaklanir
        sart true ise if body'si calisir
        sart false ise if body'si calismaz

        Bagimisz if cumlelelrin kodun geriye kanalani ile ilgilenmediginden
        birden fazla if cumlesi oldugunda
        tümünün if bady si calisisabilecegi gibi,
        hic birinin if body si calismadigi da olabilir



         */

        int a = 18;
        int b = 47 ;

        // Eger a b den büyükse "a b 'den büyük "yazdirin

        if ( a > b ){

            System.out.println("a b' den buyuk");

    }

        //b cift ise , "bu sayilarin carpimi cift olur" yazdirin

        if (b % 2 == 0) {
            System.out.println("bu sayilarin carpimi cift olur");

            //a 100'den buyukse "ilk sayi cok buyuk" yazdirin.

            if (a > 100 ) {
                System.out.println("ilk sayi cok buyuk");

            }

        }

    }
}
