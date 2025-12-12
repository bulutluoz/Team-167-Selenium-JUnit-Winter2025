package day03_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileDownloadTesti extends TestBase_Each {

    @Test
    public void test01(){
        // 1. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        // 2. deneme.txt dosyasını indirelim

        driver.findElement(By.xpath("//*[text()='deneme.txt']"))
                .click();

        ReusableMethods.bekle(2);
        // 3. Dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu = "/Users/ahmetbulutluoz/Downloads/deneme.txt";
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        ReusableMethods.bekle(2);
    }
}
