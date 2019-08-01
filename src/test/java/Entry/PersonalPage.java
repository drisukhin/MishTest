package Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PersonalPage {
    public WebDriver driver;

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    private By genderField = By.xpath("//span[@id='fieldobjgender']//select");
    private By birthDateField = By.xpath("//span[@id='fieldobjdateOfBirth']//input");
    private By maritalStatusField = By.xpath("//span[@id='fieldobjmaritalStatus']//select");
    private By confessionField = By.xpath("//span[@id='fieldobjconfession']//select");
    private By languagesField = By.xpath("//*[@id='fieldobjlanguages']//select");
    private By foodField = By.xpath("//*[@id='fieldobjfoodPreferences']//select");

    private By avatarButton = By.xpath("//div[@id='idbtneditavatar']//div//i[@class='fa fa-plus-circle']");
    private By avatarProfileButton = By.id("addavatarinprofile");
    private By uploadButton = By.id("upload");
    private By saveButton = By.id("idbtnsaveprofile");


    public PersonalPage gender() {
        Select select = new Select(driver.findElement(genderField));

        select.selectByValue("Female");
        return this;
    }

    public PersonalPage birthDate(String date) throws InterruptedException {
        driver.findElement(birthDateField).click();

        driver.findElement(birthDateField).sendKeys(date);
        return this;
    }

    public PersonalPage maritalStatus() {
        Select select = new Select(driver.findElement(maritalStatusField));
        select.selectByValue("Single");
        return this;
    }

    public PersonalPage confession() {
        Select select = new Select(driver.findElement(confessionField));
        select.selectByValue("Religious");
        return this;
    }

    public PersonalPage languages() {
        Select select = new Select(driver.findElement(languagesField));
        select.selectByValue("Russian");
        return this;
    }

    public PersonalPage food() {
        Select select = new Select(driver.findElement(foodField));
        select.selectByValue("Kosher");
        return this;
    }
    public PersonalPage saveProfile(){
        driver.findElement(saveButton).click();
        return this;
    }

}
