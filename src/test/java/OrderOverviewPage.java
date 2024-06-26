import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOverviewPage {

    public WebDriver driver;

    @FindBy(id = "finish")
    private WebElement finishBtn;

    public OrderOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickFinishBtn() {
        finishBtn.click();
    }
}
