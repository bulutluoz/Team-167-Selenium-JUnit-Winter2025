package day03_fileTestleri;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_JavaIleBilgisayardakiDosyayaUlasma {

    @Test
    public void fileExistsTesti() throws FileNotFoundException {

        // day03 package'i altinda deneme.txt dosyasinin var oldugunu test edin

        // FileInputStream Java'nin bilgisayarda mevcut olan dosyalara erisme kutuphanesidir
        // FileInputStream'in dosyaya ulasabilmesi icin dosya yoluna ihtiyaci vardir

        String absoluteDosyaYolu = "/Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/Team167_JunitFramework/src/test/java/day03_fileTestleri/deneme.txt";
        String dosyaYolu = "src/test/java/day03_fileTestleri/deneme.txt";


        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Unhandled exception: java.io.FileNotFoundException
        // ya dosyayi bulamazsam diyor


        // Java yukardaki fileInputStream objesi sayesinde
        // verdigimiz dosyaya ulasabilir
        // dosya yolu, dosya adi veya dosya uzantisi yanlis olursa exception olusur

        // verilen dosya yolunun dogru olup olmadigini anlamak icin
        // Java'daki hazir bir method'u kullanabiliriz

        System.out.println(Files.exists(Paths.get(dosyaYolu))); // true


        String yanlisDosyaYolu = "src/test/java/day03_fileTestleri/seneme.txt";
        System.out.println(Files.exists(Paths.get(yanlisDosyaYolu))); // false

        String yanlisDosyaYolu2 = "src/test/java/day03_fileTestleri/deneme";
        System.out.println(Files.exists(Paths.get(yanlisDosyaYolu2))); // false


    }
}
