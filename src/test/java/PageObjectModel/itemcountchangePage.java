package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class itemcountchangePage extends Driver {


    @FindBy(xpath="//section[@id='bagTotal']/span[2]")
    private WebElement BagTotal;
    @FindBy(xpath="//section[@id='bagDiscount']/span[2]")
    private WebElement Bagdicount;
    @FindBy(xpath="//section[@id='estimatedGst']/span[2]")
    private WebElement ApplicableGST;
    @FindBy(xpath="//section[@id='orderTotal']/span[2]")
    private WebElement OrderTotal;
    @FindBy(xpath="//div[@class='delete-btn']")
    private WebElement deleteprd;
    @FindBy(xpath="//div[@id=\"modalId\"]/div/div/div[2]/div[2]/div[2]")
    private WebElement deletebtn;
    public itemcountchangePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void itemnumberbeforeafterdeletion() throws InterruptedException {

        String BagTotal1=BagTotal.getText();
        System.out.println("BagTotal before Item Count Changes: "+BagTotal1);
        String Bagdicount1=Bagdicount.getText();


        System.out.println("Bagdicount before Item Count Changes: "+Bagdicount1);
        String ApplicableGST1=ApplicableGST.getText();
        System.out.println("ApplicableGST before Item Count Changes: "+ApplicableGST1);
        String OrderTotal1=OrderTotal.getText();
        System.out.println("OrderTotal before Item Count Changes: "+OrderTotal1);

        deleteprd.click();
        Thread.sleep(4000);
        deletebtn.click();
        Thread.sleep(6000);

        driver.navigate().refresh();

        String BagTotal2=BagTotal.getText();
        System.out.println("BagTotal after Item Count Changes: "+BagTotal2);
        String Bagdicount2=Bagdicount.getText();
        System.out.println("Bagdicount after Item Count Changes: "+Bagdicount2);
//        String ApplicableGST2=ApplicableGST.getText();
//        System.out.println("ApplicableGST before Item Count Changes: "+ApplicableGST2);
        String OrderTotal2=OrderTotal.getText();
        System.out.println("OrderTotal after Item Count Changes: "+OrderTotal2);


        Assert.assertNotEquals(BagTotal2,BagTotal1);
        Assert.assertNotEquals(Bagdicount2,Bagdicount1);
//        Assert.assertNotEquals(ApplicableGST2,ApplicableGST1);// Mostly GST Value is Same Even if the Product is Removed
        Assert.assertNotEquals(OrderTotal2,OrderTotal1);

        System.out.println("");
        System.out.println("OrderSummer is Changed When item Count is Changed: ");


    }
}

