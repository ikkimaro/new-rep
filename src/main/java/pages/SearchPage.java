package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private static WebDriver driver;

    @FindBy(css="input.gLFyf.gsfi")
    private WebElement searchInput;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void search(String text){
        searchInput.sendKeys("Calculator", Keys.ENTER);
    }
}
