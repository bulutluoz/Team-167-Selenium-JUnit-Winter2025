package day03_fileTestleri;

public class C04_DosyaYolunuDinamikYapma {

    public static void main(String[] args) {

        /*
            Dosya yukleme ve indirme icin genel olarak iki dosya konumundan bahsettik
            1- direkt proje altinda olan dosyalar

               /Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/Team167_JunitFramework/src/test/java/day03_fileTestleri/deneme.txt

            2- Bilgisayarimizda proje disindaki konumda olan dosyalar
               bunlar daha cok Desktop veya Downloads gibi ana dosyalarda olurlar

               /Users/ahmetbulutluoz/Desktop/merhaba.docx


            SORU : benim bilgisayarimdaki dosyalara gore yazdigim dosya yollari,
                   baska bilgisayarlarda CALISMAZ


            Java bu tur sorunlari cozmek icin yukarda yazdigimiz 2 temel konumu bize veren
            2 hazir method olusturmus

            proje altinda olanlar
              her kullanicida farkli :  /Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/
              tum kullanicilarda ayni : Team167_JunitFramework/src/test/java/day03_fileTestleri/deneme.txt

            bilgisayarin diger bolumlerinde
              her kullanicida farkli : /Users/ahmetbulutluoz/
              tum kullanicilarda ayni : Downloads/merhaba.docx

         */

        System.out.println(System.getProperty("user.dir")); // projenin ana dosyasinin yolunu verir
        //    /Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/Team167_JunitFramework

        System.out.println(System.getProperty("user.home")); // bilgisayrdaki ana kullanici yolunu verir
        //    /Users/ahmetbulutluoz



        //     eger proje altindaki bir dosya ile ilgili test yaziyorsaniz
        String denemeDosyaYolu = System.getProperty("user.dir") + "/src/test/java/day03_fileTestleri/deneme.txt" ;

        System.out.println(denemeDosyaYolu);
        //   /Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/Team167_JunitFramework/src/test/java/day03_fileTestleri/deneme.txt


        //     eger Downloads veya Desktop gibi ana konumlarda ise
        String merhabaDosyaYolu = System.getProperty("user.home") + "/Downloads/merhaba.docx" ;


        System.out.println(merhabaDosyaYolu);
        //       /Users/ahmetbulutluoz/Downloads/merhaba.docx

    }
}
