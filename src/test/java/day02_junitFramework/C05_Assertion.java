package day02_junitFramework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Assertion {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testotomasyonuTesti() throws InterruptedException {
        // 1.method testotomasyonu anasayfaya gidin
        //          title'in Test Otomasyonu icerdigini test edin
        driver.get("https://www.testotomasyonu.com");

        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Testotomasyonu testi PASSED");
        } else System.out.println("Testotomasyonu testi FAILED");
    }

    @Test
    public void wisequarterTesti() throws InterruptedException {
        // 2.method wisequarter anasayfaya gidin
        //          url'in wisequarter icerdigini test edin

        driver.get("https://www.wisequarter.com");

        String expectedUrlIcerik = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("wisequarter testi PASSED");
        } else System.out.println("wisequarter testi FAILED");

    }

    @Test
    public void junitTesti() throws InterruptedException {
        // 3.method junit.org adresine gidin
        //          url'in "https://junit.org/junit5/" oldugunu test edin

        driver.get("https://junit.org/junit5/");

        String expectedUrl = "https://junit.org/junit5/";
        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals(expectedUrl,actualUrl);

    }
}
