package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchPage;
import commons.Driver;
import org.testng.annotations.Test;

public class SearchTest extends Driver {
    @Test(dataProvider = "Search", dataProviderClass = DPlogin.class)
    public void avalidateLogin(String username,String password,String prdct) throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsernameandPassword(username,password);
        Thread.sleep(4000);
        SearchPage searchPage=new SearchPage(driver);
//        boolean headandsignflag=loginPage.isheadersignInPesent();
//        Assert.assertEquals(true,headandsignflag);
        searchPage.enterproduct(prdct);
//        boolean wlcmflag=loginPage.iswlcmpresnt();
//        Assert.assertEquals(true,wlcmflag);
        Thread.sleep(4000);
    }
//
}
