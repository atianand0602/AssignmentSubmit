package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PlanPage extends BasePage {
	@FindBy(xpath = "(//div[@class='plan'])[2]//div[@class='country']")
    private WebElement secondPlanCountry;

    @FindBy(xpath = "(//div[@class='plan'])[2]//div[@class='data']")
    private WebElement secondPlanData;

    @FindBy(xpath = "(//div[@class='plan'])[2]//div[@class='validity']")
    private WebElement secondPlanValidity;

    @FindBy(xpath = "(//div[@class='plan'])[2]//div[@class='plan-type']")
    private WebElement secondPlanType;

    @FindBy(xpath = "(//div[@class='plan'])[2]//div[@class='price']")
    private WebElement secondPlanPrice;

    public PlanPage(WebDriver driver) {
        super(driver);
    }

    public String getSecondPlanCountry() {
        return secondPlanCountry.getText();
    }

    public String getSecondPlanData() {
        return secondPlanData.getText();
    }

    public String getSecondPlanValidity() {
        return secondPlanValidity.getText();
    }

    public String getSecondPlanType() {
        return secondPlanType.getText();
    }

    public String getSecondPlanPrice() {
        return secondPlanPrice.getText();
    }
}
