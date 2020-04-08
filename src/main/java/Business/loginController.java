package Business;

import ConfigDriver.DriverClass;
import Pages.loginPage;
import Pages.newAccountPage;
import org.junit.Assert;

public class loginController {

    DriverClass driver;

    public loginController()
    {
        driver = new DriverClass();
    }

    public void PaginaIngreso(String url)
    {
        driver.open_application(url);
    }

    public void userButton()
    {
        loginPage page = new loginPage(driver);
        page.clickButtonUser();
    }

    public void typeUsername(String usern)
    {
        loginPage page = new loginPage(driver);
        page.typeUsername(usern);
    }

    public void typePassword(String pass)
    {
        loginPage page = new loginPage(driver);
        page.typePassword(pass);
    }

    public void clicLogin()
    {
        loginPage page = new loginPage(driver);
        page.clicLogin();
    }

    public void getUserNameTitle(String username)
    {
        loginPage page = new loginPage(driver);
        String name = page.getUserNameTitle();
        Assert.assertTrue("Se esperaba "+username+ "pero se obtuvo "+name,username.equals(name));
    }

    public void clicSpeakersImg() throws InterruptedException
    {
        loginPage page = new loginPage(driver);
        page.clicSpeakersImg();
    }

    public void clicBuy()
    {
        loginPage page = new loginPage(driver);
        page.clicBuy();
    }

    public void clicSelectColor()
    {
        loginPage page = new loginPage(driver);
        page.clicSelectColor();
    }

    public void clicButtonMore()
    {
        loginPage page = new loginPage(driver);
        page.clicButtonMore();
    }
}
