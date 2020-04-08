package Pages;

import ConfigDriver.DriverClass;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class newAccountPage {

    DriverClass driver;

    @FindBy(css = "svg#menuUser")
    WebElement buttonUser;

    @FindBy(css = "[translate='CREATE_NEW_ACCOUNT']")
    WebElement buttonCreateAccount;

    @FindBy(name = "usernameRegisterPage")
    WebElement userName;

    @FindBy(name = "emailRegisterPage")
    WebElement email;

    @FindBy(css = "input[name='passwordRegisterPage']")
    WebElement password;

    @FindBy(name = "confirm_passwordRegisterPage")
    WebElement confirmPassword;

    @FindBy(name = "first_nameRegisterPage")
    WebElement firstName;

    @FindBy(name = "last_nameRegisterPage")
    WebElement lastName;

    @FindBy(name = "phone_numberRegisterPage")
    WebElement phoneNumber;

    @FindBy(name = "countryListboxRegisterPage")
    WebElement country;

    @FindBy(name = "cityRegisterPage")
    WebElement city;

    @FindBy(name = "addressRegisterPage")
    WebElement address;

    @FindBy(name = "state_/_province_/_regionRegisterPage")
    WebElement province;

    @FindBy(name = "postal_codeRegisterPage")
    WebElement postalCode;

    @FindBy(name = "allowOffersPromotion")
    WebElement checkPromotion;

    @FindBy(name = "i_agree")
    WebElement legalWarn;

    @FindBy(css = "button#register_btnundefined")
    WebElement buttonRegister;

    @FindBy(css = ".containMiniTitle")
    WebElement loginUser;

    @FindBy(css = ".block.center.smollMargin > font > font")
    WebElement alertValidation;

    public newAccountPage(DriverClass driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver.getDriver(), this);
    }

    public void clickButtonUser()
    {
        buttonUser.click();
    }

    public void clickButtonNewAccount()
    {
        buttonCreateAccount.click();
    }

    public void typeUserName(String username)
    {
        userName.sendKeys(username);
    }

    public void typeEmail(String mail)
    {
        email.sendKeys(mail);
    }

    public void typePassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void typeConfirmPassword(String confirmPass)
    {
        confirmPassword.sendKeys(confirmPass);
    }

    public void typeFirtsName(String firtsname)
    {
        firstName.sendKeys(firtsname);
    }

    public void typeLastName(String lastNam)
    {
        lastName.sendKeys(lastNam);
    }

    public void typePhoneNumber(String phone) throws InterruptedException {
        phoneNumber.sendKeys(phone);
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver.getDriver();
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(500);
    }

    public void selectCountry(String countr)
    {
        new Select(country).selectByVisibleText(countr);
    }

    public void typeCity(String cit)
    {
        city.sendKeys(cit);
    }

    public void typeProvince(String prov)
    {
        province.sendKeys(prov);
    }

    public void typeAddress(String addre)
    {
        address.sendKeys(addre);
    }

    public void typePostalCode(String code)
    {
        postalCode.sendKeys(code);
    }

    public void uncheckPromotion()
    {
        checkPromotion.click();
    }

    public void checkLegalWarning()
    {
        legalWarn.click();
    }

    public void clicButtonRegister()
    {
        buttonRegister.click();
    }

    public String getLoginUserName()
    {
       return loginUser.getText();
    }

    public String getAlertMessage()
    {
        return alertValidation.getText();
    }


}
