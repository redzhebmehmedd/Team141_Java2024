package day05_concatenation_mantiksalKarsilastirmalar;

public class C01_Concatenation {

    public static void main(String[] args) {

    String str1 = "Java" ;

    String str2 = "Candir" ;

        System.out.println(str1 + str2);

        // String metin ifadeler barindirdigindan matemetiksel islemlerde kullanilmaz

        //System.out.println(str1 * str2); Operator '*' cannot be applied to 'java.lang.String',
        // System.out.println(str1 / str2); Operator '/' cannot be applied to 'java.lang.String',
        //System.out.println(str1 - str2); Operator ' - ' cannot be applied to 'java.lang.String',


        System.out.println(str1 + str2); //JavaCandir

        System.out.println(str1 +" " + str2); // Java Candir

        //String ile + islemine hangi data türü girer ise girsin
        // String onu metne cevirir

        System.out.println(str1 + 5 ); // "Java5"

        System.out.println(str1 + 5 + 6 + str2); // "Java56Candir"




    }






}
