package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    private By closeButton = By.id("closedIntro");
    private By registrButton = By.id("adduser");

    public MainPage closeButtonClick() {
        driver.findElement(closeButton).click();
        return this;
    }

    public MainPage registrButtonClick() {
        driver.findElement(registrButton).click();
        return this;
    }
}
