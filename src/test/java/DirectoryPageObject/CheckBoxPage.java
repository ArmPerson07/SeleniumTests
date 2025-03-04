package DirectoryPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BaseSeleniumPage {
    @FindBy(xpath = "//div[@class='card-body']//h5[1]")
    protected WebElement elementsMenu;

    @FindBy(xpath = "//li[@id='item-1'][1]")
    protected WebElement checkBoxMenu;

    @FindBy(xpath = "//button[@aria-label='Toggle']")
    protected WebElement openTheListButton;

    @FindBy(xpath = "//span[contains(text(), 'Downloads')]")
    protected WebElement downloadsButton;

    @FindBy(xpath = "//span[@class='text-success'][1]")
    protected WebElement downloadsClick;

    public CheckBoxPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public CheckBoxPage clickToDownloadsInCheckBox() {
        elementsMenu.click();
        checkBoxMenu.click();
        openTheListButton.click();
        downloadsButton.click();
        return this;
    }

    public CheckBoxPage checkToDownloadsInCheckBox() {
        elementsMenu.click();
        checkBoxMenu.click();
        openTheListButton.click();
        downloadsButton.click();
        Assertions.assertTrue(downloadsClick.getText().contains("downloads"));
        return this;
    }
}
