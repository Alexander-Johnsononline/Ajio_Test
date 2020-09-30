package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.*;
import commons.Driver;
import org.testng.annotations.Test;

public class CoupenCheckTest extends Driver {
    @Test(dataProvider = "ValidCoupen", dataProviderClass = DPlogin.class)
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

        MybagCountpage mybagCountpage=new MybagCountpage(driver);
        mybagCountpage.cartitemnumbercheck();
        Thread.sleep(4000);

        CoupenCheckPage coupenCheckPage=new CoupenCheckPage(driver);
        coupenCheckPage.ApplyCoupen();
        Thread.sleep(4000);


    }
}

