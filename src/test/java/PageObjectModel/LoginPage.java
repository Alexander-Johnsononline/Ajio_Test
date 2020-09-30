package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Driver {
    @FindBy(name="username")
    private WebElement username;
    @FindBy(className="login-btn")
    private WebElement loginbtn;
    @FindBy(name="password")
    private WebElement passwrd;
    @FindBy(xpath="//div[@class='box-margin']/child::input")
    private WebElement startshop;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterUsernameandPassword(String Username, String Password) throws InterruptedException {
        username.sendKeys(Username);
        loginbtn.click();
        Thread.sleep(6000);
        passwrd.sendKeys(Password);
//        inbetween Please add the captcha yourself
        Thread.sleep(20000);  //time to add captcha manually, Type the captcha onlye after the password is entered//
        startshop.click();

   }

}