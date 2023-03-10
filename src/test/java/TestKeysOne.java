import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKeysOne {

    @Test
    public void testirovanie() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@data-test='username']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[name=password]"));
        password.sendKeys("secret_sauce");

        WebElement webElement = driver.findElement(By.id("login-button"));
        webElement.click();

        //------------------------------------------------

        WebElement listElementAdd = driver.findElement(By.xpath("//div[@class='inventory_item'][1]//button[text()='Add to cart']"));
        listElementAdd.click();

        WebElement basket = driver.findElement(By.id("shopping_cart_container"));
        basket.click();

        WebElement checkout = driver.findElement(By.cssSelector("button[name=checkout]"));
        checkout.click();

        //--------------------------------------------------

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("test");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("test");

        WebElement postalCode = driver.findElement(By.cssSelector("input[name=postalCode]"));
        postalCode.sendKeys("test");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
    }
}
