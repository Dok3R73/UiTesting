import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestCaseTwo {

    private static final String FINISH_MESSAGE = "Epic sadface: Username and password do not match any user in this service";

    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        loginPage = new LoginPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test() {
        loginPage.inputLogin("test");

        loginPage.inputPassword("test");

        loginPage.clickLoginBtn();

        Assert.assertTrue(driver.getPageSource().contains(FINISH_MESSAGE));
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}
