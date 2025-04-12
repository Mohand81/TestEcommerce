import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom.*;

public class Test {

    static WebDriver driver;

    @BeforeAll

    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
       options.addArguments("--disable-dev-shm-usage");
       options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-gpu");
        //options.addArguments("--headless"); // Si exécuté sur un serveur sans interface graphique
        options.addArguments("--user-data-dir=/tmp/chrome-user-data"); // Répertoire temporaire
        driver = new ChromeDriver(options);
        options.addArguments("--disable-save-password-bubble"); // Désactive la popup
        driver.get("http://www.automationpractice.pl/index.php?");
        driver.manage().window().maximize();
    }

    @org.junit.jupiter.api.Test

    public void Test_001 (){
        IndexPage ObjIndexPage = new IndexPage(driver);
        Assertions.assertTrue(ObjIndexPage.validateLogo());
        SearchResultPage ObjSearchResultPage = new SearchResultPage(driver);
        ObjIndexPage.searchSub();

    }

@org.junit.jupiter.api.Test

    public void Test_002 (){
        SearchResultPage ObjSearchResultPage = new SearchResultPage(driver);
    ProductPage ObjProductPage = new ProductPage(driver);
        ObjSearchResultPage.Clickmore();
    }

@org.junit.jupiter.api.Test

    public void Test_003 () throws InterruptedException {
    ProductPage ObjProductPage = new ProductPage(driver);
    SummaryPage ObjSummaryPage = new SummaryPage(driver);
    ObjProductPage.choisirTailleM();
    ObjProductPage.SelectCouleur();
}

@org.junit.jupiter.api.Test

    public void Test_004 () {
    SummaryPage ObjSummaryPage = new SummaryPage(driver);
    ObjSummaryPage.Checkout();
    //Assertions.assertTrue(ObjSummaryPage.Verify1().equals("Printed Chiffon Dress"),"error");
   // Assertions.assertTrue(ObjSummaryPage.Verify2().equals("TOTAL"),"error2");
    ObjSummaryPage.clickProceed2();

}

@org.junit.jupiter.api.Test

    public void Test_005 ()  {
    LoginPage ObjLoginPage = new LoginPage(driver);
   ObjLoginPage.signIN();
}


@org.junit.jupiter.api.Test

    public void Test_006 (){
        AdressesPage ObjAdressesPage= new AdressesPage(driver);
    ObjAdressesPage.selectCountry();
    ObjAdressesPage.selectState();
    ObjAdressesPage.RempliAdress();
    ObjAdressesPage.CheckOutBTN();
    ObjAdressesPage.chekout2();
}

@org.junit.jupiter.api.Test

    public void Test_007 (){
     PaiementPage ObjPaiementPage = new PaiementPage(driver);
     ObjPaiementPage.PayConfirm();
}

}




