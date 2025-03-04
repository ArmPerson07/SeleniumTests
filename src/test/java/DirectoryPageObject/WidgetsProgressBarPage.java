package DirectoryPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsProgressBarPage extends BaseSeleniumPage {
    @FindBy(xpath = "//h5[contains(text(),'Widgets')]")
    protected WebElement clickToWidgets;

    @FindBy(xpath = "//span[contains(text(),'Progress Bar')]")
    protected WebElement clickprogressBar;

    @FindBy(xpath = "//button[@id='startStopButton']")
    protected WebElement startButton;

    @FindBy(xpath = "//div[@aria-valuenow='100']")
    protected WebElement progressBarValue;

    public WidgetsProgressBarPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public WidgetsProgressBarPage clickToWidgets() {
        clickToWidgets.click();
        clickprogressBar.click();
        startButton.click();
        Assertions.assertTrue(progressBarValue.getText().contains("100"));
        return this;
    }

}
