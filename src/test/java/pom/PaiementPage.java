package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaiementPage {

    @FindBy(xpath= "//a[@class='cheque']")
    private WebElement payCheque;


    @FindBy (xpath= "//button[@class='button btn btn-default button-medium']")
    private WebElement ConfirmOrder;


    WebDriver driver;
    Actions actions;

    public PaiementPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void PayConfirm(){
        payCheque.click();
        ConfirmOrder.click();
    }

}
