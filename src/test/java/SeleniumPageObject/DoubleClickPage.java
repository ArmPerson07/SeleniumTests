package SeleniumPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage extends BaseSeleniumPage {
    Actions action = new Actions(driver);

    @FindBy(xpath = "//div[@class='card-body']//h5[1]")
    protected WebElement clickToElements;

    @FindBy(xpath = "//span[contains(text(),'Buttons')]")
    protected WebElement clickToButtons;

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    protected WebElement doubleClickBtn;

    @FindBy(xpath = "//p[@id='doubleClickMessage']")
    protected WebElement checkDoubleClickMessage;


    public DoubleClickPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public DoubleClickPage doubleClickToButtons() {
        clickToElements.click();
        clickToButtons.click();
        action.doubleClick(doubleClickBtn).perform();
        Assertions.assertTrue(checkDoubleClickMessage.getText().contains("You have done a double click"));
        return this;
    }
}
