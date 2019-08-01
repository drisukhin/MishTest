package Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryMainPage {
    public WebDriver driver;

    public EntryMainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By closeButton = By.id("closedIntro");
    private By signButton = By.id("idsignin");
    private By loginField = By.id("logininput");
    private By passField = By.id("passwordinput");
    private By signInButton = By.id("signinrequest");

    public EntryMainPage closeButtonClick() {
        driver.findElement(closeButton).click();
        return this;
    }

    public EntryMainPage regButtonClick() {
        driver.findElement(signButton).click();
        return this;
    }

    public EntryMainPage loginFill(String login) {
        driver.findElement(loginField).click();
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public EntryMainPage passFill(String password) {
        driver.findElement(passField).click();
        driver.findElement(passField).sendKeys(password);
        return this;
    }

    public EntryMainPage signInClick() {
        driver.findElement(signInButton).click();
        return this;
    }
}
