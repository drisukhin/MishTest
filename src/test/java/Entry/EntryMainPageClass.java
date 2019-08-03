package Entry;

import CreateEvents.CreateEventsMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

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
        Thread.sleep(5000);


    }

    @Test(alwaysRun = true)
    void PersonalPageTestGuest() throws InterruptedException, AWTException {
        sighnInTest();
        PersonalPageGuest personalPageGuest = new PersonalPageGuest(driver);
        Thread.sleep(5000);
        personalPageGuest.profile();
        personalPageGuest.editProfile();
        Thread.sleep(3000);
        personalPageGuest.gender();
        personalPageGuest.birthDate("16091990");
        personalPageGuest.maritalStatus();
        personalPageGuest.confession();
        personalPageGuest.languages();
        personalPageGuest.food();
        personalPageGuest.avatarButton();
        Thread.sleep(3000);
        personalPageGuest.setClipboard("C:\\Users\\Dmitriy\\Downloads\\cat.jpg");
        Thread.sleep(3000);
        personalPageGuest.addImage();
        Thread.sleep(2000);
        personalPageGuest.okButton();
        //personalPageGuest.avatarProfile();

        // personalPageGuest.closeButtonClick();

        // Assert.assertEquals("List events",personalPageGuest.listEventsItem());
        Thread.sleep(5000);

    }

    @Test(alwaysRun = false)
    void PersonalPageTestFamilyTest() throws InterruptedException, AWTException {

        sighnInTest();
        PersonalPageFamily personalPageFamily = new PersonalPageFamily(driver);
        personalPageFamily.typeProfileClick();
        Thread.sleep(3000);
        personalPageFamily.familyName("Kofman");
        personalPageFamily.description("My Great Family");
        personalPageFamily.saveProfile();
        personalPageFamily.closeButton();
        Thread.sleep(5000);

    }

    @Test
    void createEventsTest() throws InterruptedException, AWTException {
        sighnInTest();
        PersonalPageGuest personalPageGuest = new PersonalPageGuest(driver);
        CreateEventsMainPage cemc = new CreateEventsMainPage(driver);
        cemc.createEvents();
        cemc.eventTitle("Purim");
        cemc.description("The best holiday!!!");
        cemc.date();
        cemc.time("1800");
        cemc.duration("3");
        cemc.city("Haifa");
        cemc.street("Ben Gurion");
        cemc.builder("84");
        cemc.places("8");
        cemc.scrollPage();
        Thread.sleep(3000);
        cemc.holiday();
        cemc.confession();
        cemc.language();
        cemc.food();
        Thread.sleep(2000);
        Assert.assertEquals("Add new Event...", cemc.myEvent());
        cemc.saveEventButton();
        Thread.sleep(7000);

        Assert.assertEquals("No messages", cemc.eventStatus());

        Thread.sleep(5000);
    }


    @AfterClass
    void quit() {
        driver.quit();

    }

}
