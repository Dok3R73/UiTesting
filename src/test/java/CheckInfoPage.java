import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInfoPage {

    public WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;

    @FindBy(css = "input[name=postalCode]")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public CheckInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void inputLastName(String name) {
        lastName.sendKeys(name);
    }

    public void inputPostalCode(String code) {
        postalCode.sendKeys(code);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }
}
