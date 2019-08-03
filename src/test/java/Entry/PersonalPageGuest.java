package Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PersonalPageGuest {
    public WebDriver driver;

    public PersonalPageGuest(WebDriver driver) {
        this.driver = driver;
    }

    private By profileButtonClick = By.id("profile");
    private By editProfileButton = By.id("idbtneditprofile");
    //private By
    private By genderField = By.xpath("//span[@id='fieldobjgender']//select");
    private By birthDateField = By.xpath("//span[@id='fieldobjdateOfBirth']//input");
    private By maritalStatusField = By.xpath("//span[@id='fieldobjmaritalStatus']//select");
    private By confessionField = By.xpath("//span[@id='fieldobjconfession']//select");
    private By languagesField = By.xpath("//*[@id='fieldobjlanguages']//select");
    private By foodField = By.xpath("//*[@id='fieldobjfoodPreferences']//select");
    private By avatarButtonClick = By.id("idbtneditavatar");
    private By avatarProfileButton = By.id("addavatarinprofile");
    private By okButtonClick = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Registration'])[1]/following::button[1]");
    private By saveButton = By.id("idbtnsaveprofile");


    // private By closeButton = By.xpath("//div[@id='userprofileform']//div[@class='but-closed closed-btn']");
    // private By listEvents = By.xpath("//span[@id='idtitletypesearchevents']");

    public PersonalPageGuest profile() {
        driver.findElement(profileButtonClick).click();
        return this;
    }

    public PersonalPageGuest editProfile() {
        driver.findElement(editProfileButton).click();
        return this;
    }

    public PersonalPageGuest gender() {
        Select select = new Select(driver.findElement(genderField));
        select.selectByValue("Male");
        return this;
    }

    public PersonalPageGuest birthDate(String date) throws InterruptedException {
        driver.findElement(birthDateField).click();

        driver.findElement(birthDateField).sendKeys(date);
        return this;
    }

    public PersonalPageGuest maritalStatus() {
        Select select = new Select(driver.findElement(maritalStatusField));
        select.selectByValue("Single");
        return this;
    }

    public PersonalPageGuest confession() {
        Select select = new Select(driver.findElement(confessionField));
        select.selectByValue("Religious");
        return this;
    }

    public PersonalPageGuest languages() {
        Select select = new Select(driver.findElement(languagesField));
        select.selectByValue("Russian");
        return this;
    }

    public PersonalPageGuest food() {
        Select select = new Select(driver.findElement(foodField));
        select.selectByValue("Kosher");
        return this;
    }

    public PersonalPageGuest avatarButton() {
        driver.findElement(avatarButtonClick).click();
        return this;
    }

    public PersonalPageGuest avatarProfile() {
        driver.findElement(avatarProfileButton).click();
        return this;
    }

    public PersonalPageGuest saveProfile() {
        driver.findElement(saveButton).click();
        return this;
    }

    /* public PersonalPageGuest closeButtonClick() {
         driver.findElement(closeButton).click();
         return this;
     }*/
   /* public String listEventsItem(){
        String param = driver.findElement(listEvents).getText();
        return param;
    }*/
    public PersonalPageGuest addImage() throws AWTException {


        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;

    }

    public PersonalPageGuest okButton() {
        driver.findElement(okButtonClick).click();
        return this;
    }

    public PersonalPageGuest setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        avatarProfile();
        return this;
    }

}
