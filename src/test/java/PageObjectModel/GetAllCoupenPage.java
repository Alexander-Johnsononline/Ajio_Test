package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GetAllCoupenPage extends Driver {

    @FindBy(id="BLAZE")
    private WebElement Blaze;
    @FindBy(id="SPECIAL")
    private WebElement Special;
    @FindBy(id="FIRSTBUY")
    private WebElement FirstBuy;
    @FindBy(id="LUCKY250")
    private WebElement Lucky250;
    @FindBy(id="LUCKY150")
    private WebElement Lucky150;
    @FindBy(id="LUCKY")
    private WebElement Lucky;
    @FindBy(id="FREEDEL")
    private WebElement Freedel;
    @FindBy(xpath="//div[@class='input-box-div']/button")
    private WebElement Applybtn;
    public GetAllCoupenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void GetallCoupen() throws InterruptedException {

        String Coupen1=Blaze.getText();
        System.out.println("BagTotal before apply Coupen: "+Coupen1);
        String Coupen2=Special.getText();
        System.out.println("Bagdicount before apply Coupen: "+Coupen2);
        String Coupen3=FirstBuy.getText();
        System.out.println("OrderTotal before apply Coupen: "+Coupen3);
        String Coupen4=Lucky250.getText();
        System.out.println("OrderTotal before apply Coupen: "+Coupen4);
        String Coupen5=Lucky150.getText();
        System.out.println("OrderTotal before apply Coupen: "+Coupen5);
        String Coupen6=Lucky.getText();
        System.out.println("OrderTotal before apply Coupen: "+Coupen6);
        Thread.sleep(4000);

        Lucky.click();
        Thread.sleep(4000);
        Applybtn.click();
        Thread.sleep(6000);



        System.out.println("LUCKY250 Coupen is Applied and it is Working");
    }
}
