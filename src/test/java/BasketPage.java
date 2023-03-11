import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки checkout
     */
    @FindBy(css = "button[name=checkout]")
    private WebElement checkoutBtn;

    /**
     * метод для нажатия кнопки checkout
     */
    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }
}
