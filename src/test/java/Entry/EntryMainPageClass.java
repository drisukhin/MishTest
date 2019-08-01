package Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class EntryMainPageClass {
    public WebDriver driver;

    @BeforeClass
    void pre() {
        driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();

    }

    @Test
    void sighnInTest() throws InterruptedException {
        EntryMainPage entryMainPage = new EntryMainPage(driver);
        entryMainPage.closeButtonClick();
        entryMainPage.regButtonClick();
        entryMainPage.loginFill("mastakdm90");
        entryMainPage.passFill("qwerty11111");
        entryMainPage.signInClick();

    }

    @Test(dependsOnMethods = "sighnInTest")
    void PersonalPageTest() throws InterruptedException, AWTException {
        PersonalPage personalPage = new PersonalPage(driver);
        Thread.sleep(5000);
        personalPage.gender();
        personalPage.birthDate("16091990");
        personalPage.maritalStatus();
        personalPage.confession();
        personalPage.languages();
        personalPage.food();
        personalPage.saveProfile();
        Thread.sleep(5000);
    }

    @AfterClass
    void quit() {
        driver.quit();

    }

}
