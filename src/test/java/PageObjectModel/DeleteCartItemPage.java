package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCartItemPage extends Driver {

    @FindBy(xpath="//div[@class='delete-btn']")
    private WebElement deleteprd;
    @FindBy(xpath="//div[@id=\"modalId\"]/div/div/div[2]/div[2]/div[2]")
    private WebElement deletebtn;
    public DeleteCartItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void DeleteProduct() throws InterruptedException
    {
        deleteprd.click();
        Thread.sleep(4000);
        deletebtn.click();
        Thread.sleep(6000);

        System.out.println(" ");
        System.out.println("Product is Deleted ");
    }

}

