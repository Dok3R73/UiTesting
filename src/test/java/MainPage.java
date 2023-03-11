import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки добавления в корзину 1 элемента
     */
    @FindBy(xpath = "//div[@class='inventory_item'][1]//button[text()='Add to cart']")
    private WebElement addProduct;

    /**
     * определение локатора кнопки входа в корзину
     */
    @FindBy(id = "shopping_cart_container")
    private WebElement BasketBtn;

    /**
     * метод для нажатия кнопки перейти в корзину
     */
    public void clickBasketBtn() {
        BasketBtn.click();
    }

    /**
     * метод для осуществления нажатия кнопки добавить в корзину
     */
    public void clickAddBtn() {
        addProduct.click();
    }
}
