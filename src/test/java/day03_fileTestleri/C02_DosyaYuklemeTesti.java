package day03_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C02_DosyaYuklemeTesti extends TestBase_Each {

    @Test
    public void dosyaYuklemeTesti(){

        // https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        // chooseFile butonuna basalim
        // Yuklemek istediginiz deneme.txt dosyasini secelim.

        // Selenium WebDriver ile istenen sayfaya gidebiliriz,
        // o sayfada chooseFile butonunu locate edip click yapabiliriz
        // AMMMMMMAAAAA acilan bilgisayarin klasor yapisindan dosya SECEMEYIZ....

        // Selenium bu islemi yapabilmemiz icin
        // chooseFile butonuna yuklemek istediginiz dosyanin dosya yolunu sendKeys ile yollamamizi ister

        WebElement chooseFileButonu = driver.findElement(By.id("file-upload"));
        String dosyaYolu = "/Users/ahmetbulutluoz/Desktop/MyDesktop/course/projeler/Team167_JunitFramework/src/test/java/day03_fileTestleri/deneme.txt";

        chooseFileButonu.sendKeys(dosyaYolu);

        ReusableMethods.bekle(3);


        // Upload butonuna basalim.

        driver.findElement(By.id("file-submit"))
                .click();


        ReusableMethods.bekle(3);
        // “File Uploaded!” textinin goruntulendigini test edelim.

        String expectedUploadYazisi = "File Uploaded!";
        String actualUploadYazisi = driver.findElement(By.tagName("h3")).getText();

        Assertions.assertEquals(expectedUploadYazisi,actualUploadYazisi);

    }
}
