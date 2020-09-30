package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.LoginPage;
import PageObjectModel.MultiplePage;
import PageObjectModel.SearchPage;
import commons.Driver;
import org.testng.annotations.Test;

public class MultipleTest extends Driver {
    @Test(dataProvider = "Multiproduct", dataProviderClass = DPlogin.class)
    public void avalidateLogin(String username,String password,String prdct) throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsernameandPassword(username,password);
        Thread.sleep(4000);

        SearchPage searchPage=new SearchPage(driver);
        searchPage.enterproduct(prdct);
        Thread.sleep(4000);

        MultiplePage multiplePage=new MultiplePage(driver);
        multiplePage.Addmultiplrproducttocart();
        Thread.sleep(4000);



    }
}
