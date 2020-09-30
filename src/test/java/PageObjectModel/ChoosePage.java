package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class ChoosePage extends Driver {

    @FindBy(xpath="//img[@alt='Pepe Jeans Grey PJ7241C4 G UV-Protected Full-Rim Wayfarers']")
    private WebElement productselect;
    @FindBy(xpath="//div[@class='pdp-addtocart-button']")
    private WebElement cartbtn;
    public ChoosePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void Chooseprdandaddtocart() throws InterruptedException {
        productselect.click();
        Thread.sleep(4000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        cartbtn.click();
//        driver.close();
        driver.switchTo().window(newTab.get(0));

    }


}
