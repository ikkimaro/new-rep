package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.CalcButtons;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalc1 {

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

        buttons.bracket1.click();

        buttons.Button1.click();

        buttons.plusButton.click();

        buttons.Button2.click();

        buttons.bracket2.click();

        buttons.multiplyButton.click();

        buttons.Button3.click();

        buttons.minusButton.click();

        buttons.Button4.click();

        buttons.Button0.click();

        buttons.divideButton.click();

        buttons.Button5.click();

        buttons.equalsButton.click();

        assertEquals(1, driver.findElements(By.cssSelector ("div[jsname='zLiRgc']")).size());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.cssSelector("div[jsname='VkJw6']")).getText() );

    }
    @AfterAll
    public static void teardown() {

        driver.quit();
    }
}
