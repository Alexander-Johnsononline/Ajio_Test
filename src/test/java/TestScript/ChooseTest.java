package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.ChoosePage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchPage;
import commons.Driver;
import org.testng.annotations.Test;

public class ChooseTest extends Driver {
    @Test(dataProvider = "Choose", dataProviderClass = DPlogin.class)
    public void avalidateLogin(String username,String password,String prdct) throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsernameandPassword(username,password);
        Thread.sleep(4000);

        SearchPage searchPage=new SearchPage(driver);
        searchPage.enterproduct(prdct);
        Thread.sleep(4000);

        ChoosePage choosePage=new ChoosePage(driver);
        choosePage.Chooseprdandaddtocart();
        Thread.sleep(4000);



    }
//

}
