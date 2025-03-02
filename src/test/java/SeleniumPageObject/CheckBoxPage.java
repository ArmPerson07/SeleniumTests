package SeleniumPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BaseSeleniumPage {
    @FindBy(xpath = "//div[@class='card-body']//h5[1]")
    protected WebElement clickToElements;

    @FindBy(xpath = "//li[@id='item-1'][1]")
    protected WebElement clickToCheckBox;

    @FindBy(xpath = "//button[@aria-label='Toggle']")
    protected WebElement clickToOpenButton;

    @FindBy(xpath = "//span[contains(text(), 'Downloads')]")
    protected WebElement clickToDownloads;

    @FindBy(xpath = "//span[@class='text-success'][1]")
    protected WebElement checkClickedToDownloads;

    public CheckBoxPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public CheckBoxPage clickToCheckBox() {
        clickToElements.click();
        clickToCheckBox.click();
        clickToOpenButton.click();
        clickToDownloads.click();
        Assertions.assertTrue(checkClickedToDownloads.getText().contains("downloads"));
        return this;
    }
}
