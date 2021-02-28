package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcButtons {

    private static WebDriver driver;

    @FindBy(css = "div[jsname='Pt8tGc']")
    public WebElement equalsButton;

    @FindBy(css = "div[jsname='aN1RFf']")
    public WebElement sinButton;

    @FindBy(css = "div[jsname='bkEvMb']")
    public WebElement Button0;

    @FindBy(css = "div[jsname='N10B9']")
    public WebElement Button1;

    @FindBy(css = "div[jsname='lVjWed']")
    public WebElement Button2;

    @FindBy(css = "div[jsname='KN1kY']")
    public WebElement Button3;

    @FindBy(css = "div[jsname='xAP7E']")
    public WebElement Button4;

    @FindBy(css = "div[jsname='Ax5wH']")
    public WebElement Button5;

    @FindBy(css = "div[jsname='abcgof']")
    public WebElement Button6;

    @FindBy(css = "div[jsname='XSr6wc']")
    public WebElement plusButton;

    @FindBy(css = "div[jsname='pPHzQc']")
    public WebElement minusButton;

    @FindBy(css = "div[jsname='YovRWb']")
    public WebElement multiplyButton;

    @FindBy(css = "div[jsname='WxTTNd']")
    public WebElement divideButton;

    @FindBy(css = "div[jsname='j93WEe']")
    public WebElement bracket1;

    @FindBy(css = "div[jsname='qCp9A']")
    public WebElement bracket2;

    public CalcButtons(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


}
