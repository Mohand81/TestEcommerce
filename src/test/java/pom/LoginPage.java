package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {


    @FindBy (id = "email_create")
    private WebElement EmailField;

    @FindBy (id = "SubmitCreate")
    private WebElement CreateButton;

    @FindBy(css = "#newsletter-input")
    private WebElement EmailFieldLog;

    @FindBy (id = "passwd")
    private WebElement Paswwrd;

    @FindBy (id = "SubmitLogin")
    private WebElement SignInButtn;



    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public FormulairePage CreateAccount(){
        EmailField.click();
        EmailField.sendKeys("momo21@gmail.com");
        CreateButton.click();

        return new FormulairePage(driver);
    }

    public HomePage signIN (){
        wait.until(ExpectedConditions.visibilityOf(EmailFieldLog));
        EmailFieldLog.click();
        EmailFieldLog.sendKeys("kiki@gmail.com");
        Paswwrd.click();
        Paswwrd.sendKeys("72689");
        SignInButtn.click();
        return new HomePage(driver);

    }




}
