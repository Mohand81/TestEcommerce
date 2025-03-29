package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    @FindBy (id= "header_logo")
    private WebElement headerLogo;

    @FindBy (xpath = "//a[@class= 'login']")
    private WebElement SignInButton;

    @FindBy (xpath = "//button[@class= 'btn btn-default button-search']")
    private WebElement SubmitButton;

    @FindBy (id= "search_query_top")
    private WebElement textZone;


    WebDriver driver;
    Actions actions;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


    public LoginPage SignIn (){
        SignInButton.click();
        return new LoginPage(driver);
    }

    public boolean validateLogo (){
        return headerLogo.isDisplayed();
    }

    public SearchResultPage searchSub (){
        textZone.click();
        textZone.sendKeys("Printed Chiffon Dress");
        SubmitButton.click();

        return new SearchResultPage(driver);

    }








}
