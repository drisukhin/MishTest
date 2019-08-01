package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MainPageClass {
    public WebDriver driver;

    @BeforeClass
    void pre() {
        driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }


   @Test()
    void MainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.closeButtonClick();
        mainPage.registrButtonClick();
    }


    @Test(dependsOnMethods = {"MainPageTest"})
    void RegistrationPageTest() throws InterruptedException {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.realName("Vasiliy");
        registrationPage.typeEvents();
        registrationPage.login("pupkin" + System.currentTimeMillis());
        registrationPage.email("qwerty" + System.currentTimeMillis() + "@gmail.com");
        registrationPage.number("0588854786");
        registrationPage.password("qwerty8990KL");
        registrationPage.password2("qwerty8990KL");
        registrationPage.createAccount();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        Assert.assertEquals("Mishpahug - Shabbat within the family circle.",driver.getTitle());
        Thread.sleep(5000);

    }

    @AfterTest
    void quit() {
        driver.quit();

    }

}
