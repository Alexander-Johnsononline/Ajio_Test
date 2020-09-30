package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MultiplePage extends Driver {

    @FindBy(xpath="//img[@alt='CARRERA Black UV-Protected Round Sunglasses with Brow Bar']")
    private WebElement productselect1;
    @FindBy(xpath="//img[@alt='Pepe Jeans Grey PJ7241C4 G UV-Protected Full-Rim Wayfarers']")
    private WebElement productselect2;
    @FindBy(xpath="//img[@alt='MTV Silver UV Protected Mirrored Aviator Glasses']")
    private WebElement productselect3;
    @FindBy(xpath="//div[@class='pdp-addtocart-button']")
    private WebElement cartbtn;
    @FindBy(xpath="//div[@class='ic-cart ']")
    private WebElement maincartbtn;

    public MultiplePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void Addmultiplrproducttocart() throws InterruptedException {


        productselect1.click();
        Thread.sleep(4000);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        cartbtn.click();

        driver.switchTo().window(newTab.get(0));
        productselect2.click();
        ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab2.get(2));
        cartbtn.click();

        driver.switchTo().window(newTab.get(0));
        productselect3.click();
        ArrayList<String> newTab3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab3.get(3));
        cartbtn.click();

        driver.switchTo().window(newTab.get(0));

        maincartbtn.click();


    }


}
