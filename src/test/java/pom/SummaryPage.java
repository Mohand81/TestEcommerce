package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

@FindBy (xpath= "//*[@id='center_column']/div[1]/div[2]/p")
private WebElement VerifyText;

@FindBy (xpath= "//td[@class='total_price_container text-right']")
private WebElement TotalPrice;

    @FindBy (xpath= "//a[@class='btn btn-default button button-medium']")
    private WebElement ChekoutBoutton;

    @FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement ChekoutButton1;



    WebDriver driver;
    Actions actions;

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public String Verify1 (){
        return VerifyText.getText();
    }

    public String Verify2 (){
        return TotalPrice.getText();
    }

    public void Checkout(){
        ChekoutBoutton.click();
    }

    public LoginPage clickProceed2(){
    ChekoutButton1.click();
    return new LoginPage(driver);

}}




