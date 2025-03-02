package SeleniumPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseSeleniumPage {
    @FindBy(xpath = "//div[@class='card-body']//h5[1]")
    protected WebElement clickToElements;

    @FindBy(xpath = "//li[@id='item-0'][1]")
    protected WebElement clickToTextBox;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    protected WebElement clickToFullNameAndSend;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    protected WebElement clickToEmailAndSend;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    protected WebElement clickToAddressAndSend;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    protected WebElement clickToPermanentAddressAndSend;

    @FindBy(xpath = "//button[@id='submit']")
    protected WebElement clickToSubmit;

    @FindBy(xpath = "//p[@id='name']")
    protected WebElement checkYourTextBox;

    public TextBoxPage() {
        PageFactory.initElements(driver, this);
        driver.get("http://85.192.34.140:8081/");
    }

    public TextBoxPage createTextBox(String fullName, String email, String address, String permanentAddress) {
        clickToElements.click();
        clickToTextBox.click();
        clickToFullNameAndSend.click();
        clickToFullNameAndSend.sendKeys(fullName);
        clickToEmailAndSend.click();
        clickToEmailAndSend.sendKeys(email);
        clickToAddressAndSend.click();
        clickToAddressAndSend.sendKeys(address);
        clickToPermanentAddressAndSend.click();
        clickToPermanentAddressAndSend.sendKeys(permanentAddress);
        clickToSubmit.click();
        Assertions.assertTrue(checkYourTextBox.getText().contains(fullName));
        return this;
    }
}
