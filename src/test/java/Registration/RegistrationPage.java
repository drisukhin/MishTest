package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By realNameField = By.id("namelogin");
    private By typeButton = By.id("typeuser1");
    private By loginField = By.id("newlogininput");
    private By emailField = By.id("emailinput");
    private By numberField = By.id("phonenumberinput");
    private By passwordField = By.id("newpasswordinput");
    private By passwordFiled2 = By.id("confirmnewpasswordinput");
    private By createAccoutButton = By.id("adduserrequest");


    public RegistrationPage realName(String name) {
        driver.findElement(realNameField).sendKeys(name);
        return this;
    }

    public RegistrationPage typeEvents() {
        driver.findElement(typeButton).click();
        return this;
    }

    public RegistrationPage login(String login) {
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public RegistrationPage email(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegistrationPage number(String number) {
        driver.findElement(numberField).sendKeys(number);
        return this;
    }

    public RegistrationPage password(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
        return this;
    }

    public RegistrationPage password2(String pass2) {
        driver.findElement(passwordFiled2).sendKeys(pass2);
        return this;
    }

    public RegistrationPage createAccount()  {
        driver.findElement(createAccoutButton).click();
        return this;
    }
}
