package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    @FindBy (xpath= "//select[@name='group_1']")
    private WebElement TailleSelect;

    @FindBy (xpath = "//a[@title='Yellow']")
    private WebElement ColorSelect;

    @FindBy (xpath = "//option[@value='2']")
    private WebElement SelectM;

    @FindBy (id ="add_to_cart")
    private WebElement AddToCart;


    WebDriver driver;
    Actions actions;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


   public void choisirTailleM() {
       Select select = new Select(TailleSelect);
       select.selectByValue("3"); // Sélectionne l'option avec value="2"
   }

    public SummaryPage SelectCouleur () throws InterruptedException {
        ColorSelect.click();
        AddToCart.click();
        Thread.sleep(1000);
        return new SummaryPage(driver);
    }
}

