package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {


    @FindBy(xpath = "//img[@title='Printed Chiffon Dress']")
    private WebElement ImageClick;

    WebDriver driver;
    Actions actions;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public ProductPage Clickmore(){
        ImageClick.click();
        return new ProductPage(driver);

    }
}
