import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//button[text()='Add to cart']")
    private WebElement addProduct;

    @FindBy(id = "shopping_cart_container")
    private WebElement BasketBtn;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickBasketBtn() {
        BasketBtn.click();
    }

    public void clickAddBtn() {
        addProduct.click();
    }
}
