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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalc1 {

    private static WebDriver driver;

    @BeforeAll
   public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

    }

    @Test
    public void test1() {

        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Calculator", Keys.ENTER);

        WebElement skobka1 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div"));
        skobka1.click();

        WebElement element1 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div"));
        element1.click();

        WebElement plus = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div"));
        plus.click();

        WebElement element2 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div"));
        element2.click();

        WebElement skobka2 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div"));
        skobka2.click();

        WebElement umnoj = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div"));
        umnoj.click();

        WebElement element3 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div"));
        element3.click();

        WebElement minus = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div"));
        minus.click();

        WebElement element4 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div"));
        element4.click();

        WebElement element0 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div"));
        element0.click();

        WebElement divide = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div"));
        divide.click();

        WebElement element5 = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div"));
        element5.click();

        WebElement equals = driver.findElement(By.xpath ("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div"));
        equals.click();

        assertEquals(1, driver.findElements(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div")).size());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")).getText() );

    }
    @AfterAll
    public static void teardown() {

        driver.quit();
    }
}
