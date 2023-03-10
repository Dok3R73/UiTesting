import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKeysTwo {

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@data-test='username']"));
        userName.sendKeys("test");

        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
        password.sendKeys("test");

        WebElement webElement = driver.findElement(By.id("login-button"));
        webElement.click();
    }
}
