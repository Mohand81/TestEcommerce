package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormulairePage {

    @FindBy(xpath= "//input[@id='id_gender1']")
    private WebElement Gender;

    @FindBy(id="customer_firstname")
    private WebElement FirstName;

    @FindBy(id="customer_lastname")
    private WebElement LastName;

    @FindBy(id="email")
    private WebElement EmailField;

    @FindBy(id="passwd")
    private WebElement Password;

    @FindBy(id="days")
    private WebElement DaysField;

    @FindBy(xpath= "//option[@value='14']")
    private WebElement Clik14;

    @FindBy(id="months")
    private WebElement MouthField;

    @FindBy(xpath= "//option[@value='7']")
    private WebElement Clik7;

    @FindBy(id="years")
    private WebElement yearsField;

    @FindBy(xpath= "//option[@value='1997']")
    private WebElement clik1997;

    @FindBy(id="submitAccount")
    private WebElement SubmitBtn;



    WebDriver driver;
    Actions actions;

    public FormulairePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void FormulaireFill(){
        //Gender.click();
        LastName.click();
        LastName.sendKeys("lolo");

        Password.click();
        Password.sendKeys(" 131415");


/*
        FirstName.click();
        FirstName.sendKeys("pipo");



        EmailField.click();
        EmailField.sendKeys("pipo@gmail.com");



        DaysField.click();
        Clik14.click();

        MouthField.click();
        Clik7.click();

        yearsField.click();
        clik1997.click();

        SubmitBtn.click();
        */


    }

}
