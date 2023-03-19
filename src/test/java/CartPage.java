import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver driver;

    @FindBy(css = "button[name=checkout]")
    private WebElement checkoutBtn;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }
}
