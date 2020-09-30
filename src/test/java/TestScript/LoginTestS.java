package TestScript;

import PageObjectModel.LoginPage;
import commons.Driver;
import org.testng.annotations.*;
import DataProvider.DPlogin;

public class LoginTestS extends Driver {
    @Test(dataProvider = "Login", dataProviderClass = DPlogin.class)
    public void avalidateLogin(String UsrNm, String Pswd) throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);

        loginPage.enterUsernameandPassword(UsrNm, Pswd);

        Thread.sleep(4000);
    }

}