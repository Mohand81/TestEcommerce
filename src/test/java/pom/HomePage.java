package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath ="//a[@title='Add my first address']")
    private WebElement FirstAdressField;

    @FindBy(xpath ="//a[@title='Credit slips']")
    private WebElement CreditField;

    WebDriver driver;
    Actions actions;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean display1 (){
        return FirstAdressField.isDisplayed();
    }

    public boolean display2 (){
        return CreditField.isDisplayed();

    }
}

