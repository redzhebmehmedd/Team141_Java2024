package day05_concatenation_mantiksalKarsilastirmalar;

public class C02_Concatenation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " " ;
        String s4 = "";

        int a = 4;
        int b = 5;

        //sadece yukaridaki veriableri kullanilarak asagida verilen metinleri yazdirin

        // Java 54



        System.out.println(s1+s3+b+a); // Java 54

        // 1 Java

        System.out.println(b-a+s3+s1); // 1 Java

        // Java 9

        System.out.println(s1+s3+(a+b)); // Java 9

        // Candir20

        System.out.println(s2+a*b); //Candir 20

        // 45Java

        System.out.println(a+(b+s1));// 45Java

        System.out.println(s4+a+b+s1); // 45Java

        // "45" i nasil integer' a cevirip 1 ekleriz

        String str = "45";

        System.out.println(Integer.parseInt(str) + 1 ); // 46

        //Integre olarak verilen bir sayiyi nasil String e ceviririm

        String ab = "" + 59;

        System.out.println(ab); // 59














    }

}
