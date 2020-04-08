package Pages;

import ConfigDriver.DriverClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    DriverClass driver;

    @FindBy(css = "svg#menuUser")
    WebElement buttonUser;

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement userpassword;

    @FindBy(id = "sign_in_btnundefined")
    WebElement buttonRegistrarse;

    @FindBy(css = ".containMiniTitle")
    WebElement loginUser;

    @FindBy(css = "div#speakersImg")
    WebElement speakersImg;

    @FindBy(css = ".categoryData  button[role='button']")
    WebElement buy_now;

    @FindBy(css = ".colors.ng-scope > div:nth-of-type(1) > span:nth-of-type(2)")
    WebElement selectColor;

    @FindBy(id = ".plus")
    WebElement buttonMore;

    @FindBy(id = "input[name='quantity']")
    WebElement Quantity;

    public loginPage(DriverClass driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver.getDriver(), this);
    }

    public void clickButtonUser()
    {
        buttonUser.click();
    }

    public void typeUsername(String usern)
    {
        username.sendKeys(usern);
    }

    public void typePassword(String pass)
    {
        userpassword.sendKeys(pass);
    }

    public void clicLogin()
    {
        buttonRegistrarse.click();
    }

    public String getUserNameTitle()
    {
       return loginUser.getText();
    }

    public void clicSpeakersImg() throws InterruptedException {
        speakersImg.click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver.getDriver();
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(500);
    }

    public void clicBuy()
    {
        buy_now.click();
    }

    public void clicSelectColor()
    {
        selectColor.click();
    }

    public void clicButtonMore()
    {
        buttonMore.click();
    }


}
