package Selenium;

import SeleniumPageObject.*;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests extends BaseSeleniumTest {
    @Test
    @DisplayName("Текст бокс 1")
    public void chechkTextBox() {
        Faker faker = new Faker();
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.createTextBox(faker.name().fullName(), faker.internet().emailAddress(), faker.address().secondaryAddress(), faker.address().fullAddress());
    }

    @Test
    @DisplayName("Чек бокс")
    public void checkCheckBox() {
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.clickToCheckBox();
    }
    
    @Test
    @DisplayName("Алертсы")
    public void checkAlerts() {
        AlertsPage alertsPage = new AlertsPage();
        alertsPage.createAlertsPage();
    }

    @Test
    @DisplayName("Прогресс Бар")
    public void checkProgressBar() {
        WidgetsProgressBarPage widgetsProgressBarPage = new WidgetsProgressBarPage();
        widgetsProgressBarPage.clickToWidgets();
    }

    @Test
    @DisplayName("Двойной клик")
    public void checkDoubleClick() {
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        doubleClickPage.doubleClickToButtons();
    }
}
