import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class TestCaseOne {

    private static final String FINISH_REDIRECT_URL = "https://www.saucedemo.com/checkout-complete.html";
    private static final String FINISH_MESSAGE = "Thank you for your order";

    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static CartPage cartPage;
    public static CheckInfoPage checkInfoPage;
    public static OrderOverviewPage orderOverviewPage;

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        checkInfoPage = new CheckInfoPage(driver);
        orderOverviewPage = new OrderOverviewPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test() {
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginBtn();

        mainPage.clickAddBtn();
        mainPage.clickBasketBtn();

        cartPage.clickCheckoutBtn();

        checkInfoPage.inputFirstName("test");
        checkInfoPage.inputLastName("test");
        checkInfoPage.inputPostalCode("test");
        checkInfoPage.clickContinueBtn();

        orderOverviewPage.clickFinishBtn();

        Assert.assertEquals(driver.getCurrentUrl(), FINISH_REDIRECT_URL);

        Assert.assertTrue(driver.getPageSource().contains(FINISH_MESSAGE));
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}
