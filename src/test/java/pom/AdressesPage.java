package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdressesPage {

    @FindBy (id="address1")
    private WebElement Adress;

    @FindBy (id="city")
    private WebElement city;

    @FindBy (id="id_state")
    private WebElement id_state;

    @FindBy (id="postcode")
    private WebElement postcode;

    @FindBy (id="id_country")
    private WebElement id_country;

    @FindBy (id="phone")
    private WebElement phone;

    @FindBy (id="phone_mobile")
    private WebElement phone_mobile;

    @FindBy (id="submitAddress")
    private WebElement submitAddress;

    @FindBy (xpath= "//button[@class='button btn btn-default button-medium']")
    private WebElement ChekoutBtn;


    @FindBy (id="cgv")
    private WebElement cgv;

    @FindBy (xpath= "//button[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement Chekout2;





    WebDriver driver;
    Actions actions;

    public AdressesPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


    public void RempliAdress (){
        Adress.click();
        Adress.sendKeys("downtouw city");

        city.click();
        city.sendKeys("timesquare");

        postcode.click();
        postcode.sendKeys("07008");

        phone.click();
        phone.sendKeys("33765342566");

        phone_mobile.click();
        phone_mobile.sendKeys("33456676335");

        submitAddress.click();

    }

    public void selectState(){
        Select select = new Select(id_state);
        select.selectByValue("32");
    }

    public void selectCountry(){
        Select select = new Select(id_country);
        select.selectByValue("21");
    }

    public void CheckOutBTN (){
        ChekoutBtn.click();
    }

    public PaiementPage chekout2 (){
        cgv.click();
        Chekout2.click();
        return new PaiementPage(driver);

    }



}


