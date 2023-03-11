import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInfoPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public CheckInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора поля first_name
     */
    @FindBy(id = "first-name")
    private WebElement firstName;

    /**
     * определение локатора поля last_name
     */
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;

    /**
     * определение локатора поля postal_code
     */
    @FindBy(css = "input[name=postalCode]")
    private WebElement postalCode;

    /**
     * определение локатора кнопки continue
     */
    @FindBy(id = "continue")
    private WebElement continueBtn;

    /**
     * метод для ввода first_name
     */
    public void inputFirstName(String name) {
        firstName.sendKeys(name);
    }

    /**
     * метод для ввода last_name
     */
    public void inputLastName(String name) {
        lastName.sendKeys(name);
    }

    /**
     * метод для ввода postal_code
     */
    public void inputPostalCode(String code) {
        postalCode.sendKeys(code);
    }

    /**
     * метод для осуществления нажатия кнопки continue
     */
    public void clickContinueBtn() {
        continueBtn.click();
    }
}
