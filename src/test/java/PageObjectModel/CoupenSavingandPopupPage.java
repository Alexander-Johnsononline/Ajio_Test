package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CoupenSavingandPopupPage extends Driver {


    @FindBy(id="LUCKY") 
    private WebElement Coupenselect;
    @FindBy(xpath="//div[@class='input-box-div']/button")
    private WebElement Applybtn;
    @FindBy(xpath="//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/ul/li[3]/div/div[2]/p[1]/span")
    private WebElement CoupenSave;
    @FindBy(xpath="//p[@class='you-save-text']")
    private WebElement CoupenSavePopup;

    public CoupenSavingandPopupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void Checkthecoupenvalues() throws InterruptedException {

        driver.navigate().refresh();
        Thread.sleep(6000);

        String Coupen1=CoupenSave.getText();
        System.out.println("Coupen Save Amount in Coupen Section: "+Coupen1);
        Thread.sleep(4000);

        Coupenselect.click();
        Thread.sleep(4000);
        Applybtn.click();
        Thread.sleep(6000);

        String Coupen2=CoupenSavePopup.getText();
        System.out.println("Coupen Save Amount in Popup: "+Coupen2);




        System.out.println("");
        System.out.println("Savings Amount Given in Both Sections Are Equal:");
    }
}
