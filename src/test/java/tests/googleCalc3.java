package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalcButtons;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalc3 {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static CalcButtons buttons;


    @BeforeAll
   public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        buttons = new CalcButtons(driver);
    }

    @Test
    public void test1() {

        driver.get("http://google.com");
        searchPage.search("Calculator");

        //sin button
        buttons.sinButton.click();

        //равно
        buttons.equalsButton.click();


        assertEquals("Error", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div")).getText());
        assertEquals("sin() =", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")).getText());

    }
    @AfterAll
    public static void teardown() {

        driver.quit();
    }
}
