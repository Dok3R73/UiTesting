import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement loginField;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(css = "input[name=password]")
    private WebElement passwordField;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String passwd) {
        passwordField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
