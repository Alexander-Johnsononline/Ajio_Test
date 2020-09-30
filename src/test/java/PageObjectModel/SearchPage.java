package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchPage extends Driver {
//    private By txtsearch=By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/child::input");
//    private By txtsearchbtn=By.xpath("//button[@class='rilrtl-button']/child::span");
//    public Search(WebDriver driver){ this.driver=driver; }
    @FindBy(xpath="//div[@class='react-autosuggest__container react-autosuggest__container--open']/child::input")
    private WebElement txtsearch;
    @FindBy(xpath="//button[@class='rilrtl-button']/child::span")
    private WebElement btnsearch;
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterproduct(String Username) throws InterruptedException {
        Thread.sleep(6000);
        txtsearch.sendKeys(Username);
        Thread.sleep(5000);
        btnsearch.click();

    }

}
