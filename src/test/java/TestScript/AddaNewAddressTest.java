package TestScript;

import DataProvider.DPlogin;
import PageObjectModel.AddaNewAddressPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchPage;
import PageObjectModel.MultiplePage;
import commons.Driver;
import org.testng.annotations.Test;

public class AddaNewAddressTest extends Driver {

    @Test(dataProvider = "AddAddress", dataProviderClass = DPlogin.class)
    public void avalidateLogin(String username,String password,String prdct,String pncod,
                               String strt,String buildg,String lndmrk,String dstrct,
                               String state) throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterUsernameandPassword(username,password);
        Thread.sleep(4000);

        SearchPage searchPage=new SearchPage(driver);
        searchPage.enterproduct(prdct);
        Thread.sleep(4000);

        MultiplePage multiplePage=new MultiplePage(driver);
        multiplePage.Addmultiplrproducttocart();
        Thread.sleep(4000);

        AddaNewAddressPage addaNewAddressPage=new AddaNewAddressPage(driver);
        addaNewAddressPage.AddAddress(pncod,strt,buildg,lndmrk,dstrct,state);
        Thread.sleep(4000);



    }
}

