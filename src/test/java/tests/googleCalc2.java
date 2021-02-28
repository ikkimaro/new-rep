package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalcButtons;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalc2 {

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

        //6
        buttons.Button6.click();

        //деление
        buttons.divideButton.click();

        //0
        buttons.Button0.click();

        //равно
        buttons.equalsButton.click();


        assertEquals("Infinity", driver.findElement(By.cssSelector ("div[jsname='zLiRgc']")).getText());
        assertEquals("6 ÷ 0 =", driver.findElement(By.cssSelector("div[jsname='VkJw6']")).getText());

    }
    @AfterAll
    public static void teardown() {

        driver.quit();
    }
}
