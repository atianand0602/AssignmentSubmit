package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	@FindBy(id = "currency-selector")
    private WebElement currencySelector;

    @FindBy(xpath = "//a[text()='Thailand']")
    private WebElement thailandLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectCurrency(String currency) {
        currencySelector.click();
        currencySelector.findElement(By.xpath("//option[text()='" + currency + "']")).click();
    }

    public void clickOnThailand() {
        thailandLink.click();
    }
}
