package Business;

import ConfigDriver.DriverClass;
import Pages.newAccountPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class newAccountBusiness {

    DriverClass driver;

    public newAccountBusiness()
    {
        driver = new DriverClass();

    }

    public void PaginaIngreso(String url)
    {
        driver.open_application(url);
    }

    public void userButton()
    {
        newAccountPage page = new newAccountPage(driver);
        page.clickButtonUser();
    }

    public void buttonCreateAccount()
    {
        newAccountPage page = new newAccountPage(driver);
        page.clickButtonNewAccount();
    }

    public void typeUserName(String username)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeUserName(username);
    }

    public void typeEmail(String email)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeEmail(email);
    }

    public void typePassword(String pass)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typePassword(pass);
    }

    public void typeConfirmPassword(String confrimPass)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeConfirmPassword(confrimPass);
    }

    public void typeFirstName(String firtsName)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeFirtsName(firtsName);
    }

    public void typeLastName(String lastName)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeLastName(lastName);
    }

    public void typePhoneNumber(String phone) throws InterruptedException {
        newAccountPage page = new newAccountPage(driver);
        page.typePhoneNumber(phone);
    }

    public void selectCountry(String country)
    {
        newAccountPage page = new newAccountPage(driver);
        page.selectCountry(country);
    }

    public void typeCity(String city)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeCity(city);
    }

    public void typeAddress(String address)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeAddress(address);
    }

    public void typeProvince(String province)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typeProvince(province);
    }

    public void typeCodePostal(String code)
    {
        newAccountPage page = new newAccountPage(driver);
        page.typePostalCode(code);
    }

    public void uncheckPromotion()
    {
        newAccountPage page = new newAccountPage(driver);
        page.uncheckPromotion();
    }

    public void checkLegalWarning()
    {
        newAccountPage page = new newAccountPage(driver);
        page.checkLegalWarning();
    }

    public void clicButtonRegister()
    {
        newAccountPage page = new newAccountPage(driver);
        page.clicButtonRegister();
    }

    public void getLoginUserName(String username)
    {
        newAccountPage page = new newAccountPage(driver);
        String name = page.getLoginUserName();
        Assert.assertTrue("Se esperaba "+username+ "pero se obtuvo "+name,username.equals(name));
    }

    public void getAlertMessage(String msg)
    {
        newAccountPage page = new newAccountPage(driver);
        String alert = page.getAlertMessage();
        Assert.assertTrue("Se esperaba "+msg+ "pero se obtuvo "+alert,msg.equals(alert));
    }




}
