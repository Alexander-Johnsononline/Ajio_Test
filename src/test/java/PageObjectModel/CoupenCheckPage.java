package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class CoupenCheckPage extends Driver {

    @FindBy(xpath="//section[@id='bagTotal']/span[2]")
    private WebElement BagTotal;
    @FindBy(xpath="//section[@id='bagDiscount']/span[2]")
    private WebElement Bagdicount;
    @FindBy(xpath="//section[@id='orderTotal']/span[2]")
    private WebElement OrderTotal;

    @FindBy(id="LUCKY250")
    private WebElement Coupenselect;
    @FindBy(xpath="//div[@class='input-box-div']/button")
    private WebElement Applybtn;
    public CoupenCheckPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void ApplyCoupen() throws InterruptedException {

        String BagTotal1=BagTotal.getText();
        System.out.println("BagTotal before apply Coupen: "+BagTotal1);
        String Bagdicount1=Bagdicount.getText();
        System.out.println("Bagdicount before apply Coupen: "+Bagdicount1);
        String OrderTotal1=OrderTotal.getText();
        System.out.println("OrderTotal before apply Coupen: "+OrderTotal1);

        Coupenselect.click();
        Thread.sleep(4000);
        Applybtn.click();
        Thread.sleep(6000);

        driver.navigate().refresh();

        String BagTotal2=BagTotal.getText();
        System.out.println("BagTotal after apply Coupens: "+BagTotal2);
        String Bagdicount2=Bagdicount.getText();
        System.out.println("Bagdicount after apply Coupen: "+Bagdicount2);
        String OrderTotal2=OrderTotal.getText();
        System.out.println("OrderTotal after apply Coupen: "+OrderTotal2);


//        Assert.assertNotEquals(BagTotal2,BagTotal1);
//        Assert.assertNotEquals(Bagdicount2,Bagdicount1);
        Assert.assertNotEquals(OrderTotal2,OrderTotal1);

        System.out.println("");
        System.out.println("OrderSummer is Changed after apply Coupen: ");
    }
}
