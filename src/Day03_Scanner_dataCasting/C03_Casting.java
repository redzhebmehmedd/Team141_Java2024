package Day03_Scanner_dataCasting;

public class C03_Casting {

    public static void main(String[] args) {


        boolean bl1 = true ;
        char chr1 = '$' ;
        byte byt1 =  23;
        int tamsayi = 20 ;
        float flt1 = 45.2f ;
        double dbl1 = 44.1 ;
        String str = "Java Candir" ;



    //Bir data türündeki veriable baska data turunden deger atamaya denir

    int sayi = 20;

    double dbl = sayi;


        System.out.println(dbl); // 20.0

        //Baz data turlerine baska turden deger atayamazsiniz

dbl = byt1;
dbl = tamsayi;
dbl = flt1;

flt1 = byt1 ;
flt1 = tamsayi;
flt1 = (float) dbl1 ;

//flt1=dbl1
        tamsayi = byt1 ;
        // tamsayi = flt1;
        // tamsayi = dbl;

        //byt1 = tamsayi ;
        //byt1 = flt ;
        //byt1 = dbl ;









    }
}
