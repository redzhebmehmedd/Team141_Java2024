package day04_wrapperClass_MatematikselIslemler;

public class C04_WapperClass {

    public static void main(String[] args) {

        // String olarak verilen iki tam sayiyi toplayin

        String fiyatStr1 = "23";
        String fiyatStr2 = "45";

        System.out.println(fiyatStr1+fiyatStr2);


        //toplamayi yapabilmek icin Sting olrak verilen fiyatlari

        // Intiger a cevirmeliyiz

        System.out.println(Integer.parseInt(fiyatStr1) + Integer.parseInt(fiyatStr2)); //68

        String fiyatStr3 = "23.56";
        String fiyatStr4 = "45.21";

        System.out.println(Double.parseDouble(fiyatStr3) + Double.parseDouble(fiyatStr4));//68,77







    }
}
