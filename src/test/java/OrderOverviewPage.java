import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOverviewPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public OrderOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки finish
     */
    @FindBy(id = "finish")
    private WebElement finishBtn;

    /**
     * метод для нажатия кнопки finish
     */
    public void clickFinishBtn() {
        finishBtn.click();
    }


}
