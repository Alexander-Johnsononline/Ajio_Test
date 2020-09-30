package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidCoupenPage extends Driver {

    @FindBy(xpath="//section[@id='bagTotal']/span[2]")
    private WebElement BagTotal;
    @FindBy(xpath="//section[@id='bagDiscount']/span[2]")
    private WebElement Bagdicount;
    @FindBy(xpath="//section[@id='orderTotal']/span[2]")
    private WebElement OrderTotal;

    @FindBy(id="couponCodeInput")
    private WebElement CoupenField;
    @FindBy(xpath="//div[@class='input-box-div']/button")
    private WebElement Applybtn;
    @FindBy(xpath="//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[3]/div/span")
    private WebElement Errormsg;
    public InvalidCoupenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void ApplyInvalidCoupen(String Invalidcoupen) throws InterruptedException {

        String BagTotal1=BagTotal.getText();
        System.out.println("BagTotal before apply Coupen: "+BagTotal1);
        String Bagdicount1=Bagdicount.getText();
        System.out.println("Bagdicount before apply Coupen: "+Bagdicount1);
        String OrderTotal1=OrderTotal.getText();
        System.out.println("OrderTotal before apply Coupen: "+OrderTotal1);

        CoupenField.sendKeys(Invalidcoupen);
        Thread.sleep(4000);
        Applybtn.click();
        Thread.sleep(6000);
        Errormsg.isDisplayed();
        System.out.println();


        driver.navigate().refresh();

        String BagTotal2=BagTotal.getText();
        System.out.println("BagTotal after apply Coupens: "+BagTotal2);
        String Bagdicount2=Bagdicount.getText();
        System.out.println("Bagdicount after apply Coupen: "+Bagdicount2);
        String OrderTotal2=OrderTotal.getText();
        System.out.println("OrderTotal after apply Coupen: "+OrderTotal2);


        Assert.assertEquals(BagTotal2,BagTotal1);
        Assert.assertEquals(Bagdicount2,Bagdicount1);
        Assert.assertEquals(OrderTotal2,OrderTotal1);

        System.out.println("");
        System.out.println("OrderSummer is Not Changed after apply Coupen: "+OrderTotal2);
    }
}
