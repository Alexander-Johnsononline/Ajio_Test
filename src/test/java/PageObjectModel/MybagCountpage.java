package PageObjectModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class MybagCountpage extends Driver {


    @FindBy(xpath="//div[@class='mybag-section']/span[2]")
    private WebElement itemnum;
    public MybagCountpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void cartitemnumbercheck() throws InterruptedException {


        Thread.sleep(4000);
//        String bagtl= driver.findElement((By) itemnum).getText();
        String itemnumber=itemnum.getText();


        System.out.println("Bag Total: "+itemnumber);
        Assert.assertEquals(itemnumber,"(3 items)");
        if(itemnumber.equals("(3 items)")){
            System.out.println("Total Number and Cart Number is Equal");
        }
        else {
            System.out.println("Not Equal");
        }



    }
}
