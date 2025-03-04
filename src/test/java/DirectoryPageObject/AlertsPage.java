package DirectoryPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BaseSeleniumPage {
    @FindBy(xpath = "//h5[contains(text(), 'Alerts, Frame & Windows')]")
    protected WebElement clickToAlerts;

    @FindBy(xpath = "//span[contains(text(), 'Alerts')]")
    protected WebElement clickToAlertsAlert;

    @FindBy(xpath = "//button[@id='alertButton']")
    protected WebElement clickToAlertsButton;


    public AlertsPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public AlertsPage createAlertsPage() {
        clickToAlerts.click();
        clickToAlertsAlert.click();
        clickToAlertsButton.click();
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("You clicked a button"));

        return this;
    }
}
