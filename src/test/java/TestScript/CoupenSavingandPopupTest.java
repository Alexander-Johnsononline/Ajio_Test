package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.CoupenSavingandPopupPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchPage;
import PageObjectModel.MultiplePage;
import commons.Driver;
import org.testng.annotations.Test;

public class CoupenSavingandPopupTest extends Driver {

    @Test(dataProvider = "CoupenComparison", dataProviderClass = DPlogin.class)
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

        CoupenSavingandPopupPage coupenSavingandPopupPage=new CoupenSavingandPopupPage(driver);
        coupenSavingandPopupPage.Checkthecoupenvalues();
        Thread.sleep(4000);



    }
}

