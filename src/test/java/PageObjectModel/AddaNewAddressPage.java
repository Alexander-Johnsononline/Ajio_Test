package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
//Check Whether the user is able to insert a new Address
public class AddaNewAddressPage extends Driver {


    @FindBy(xpath="//div[@class='button-wrapper cart-fixed-button']")
    private WebElement proceedbtn;

    @FindBy(className="change-address-section")
    private WebElement Newaddress;

    @FindBy(name="postalCode")
    private WebElement Pincode;
    @FindBy(name="line2")
    private WebElement Street;
    @FindBy(name="line1")
    private WebElement Building;
    @FindBy(name="landmark")
    private WebElement LandMark;
    @FindBy(name="district-undefined-DistrictCity-10925")
    private WebElement District;
    @FindBy(name="state-undefined-State-8016")
    private WebElement State;

    @FindBy(className="rilrtl-button button mobaddaddr-save")
    private WebElement Save;


    public AddaNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void AddAddress(String pincode,String street,String building,String landmark,String district, String state) throws InterruptedException
    {

        proceedbtn.click();
        Thread.sleep(4000);
        Newaddress.click();
        Thread.sleep(6000);

        Pincode.sendKeys(pincode);
        Street.sendKeys(street);
        Building.sendKeys(building);
        LandMark.sendKeys(landmark);
//        District.sendKeys(district); // Fill Auto after Enter the Pincode
//        State.sendKeys(state); // Fill Auto after Enter the Pincode

        Save.click();


    }
}
