package Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPageFamily {
    WebDriver driver;

    public PersonalPageFamily(WebDriver driver) {
        this.driver = driver;
    }

    private By typeProfile = By.id("typeuser2inprofile");
    private By familyNameField = By.xpath("//span[@id='fieldobjfamilyName']//input");
    private By descriptionField = By.id("tafamilyDescription");
    private By saveProfileButton = By.id("idbtnsaveprofile");
    private By closeButtonClick = By.xpath("//a//i[@class='fa fa-times-circle-o']");

    public PersonalPageFamily typeProfileClick() {
        driver.findElement(typeProfile).click();
        return this;
    }

    public PersonalPageFamily familyName(String familyName) {
        driver.findElement(familyNameField).click();
        driver.findElement(familyNameField).sendKeys(familyName);
        return this;
    }

    public PersonalPageFamily description(String des) throws InterruptedException {
        driver.findElement(descriptionField).click();
        Thread.sleep(3000);
        driver.findElement(descriptionField).clear();
        driver.findElement(descriptionField).sendKeys(des);
        return this;
    }

    public PersonalPageFamily saveProfile() {
        driver.findElement(saveProfileButton).click();
        return this;
    }

    public PersonalPageFamily closeButton() {
        driver.findElement(closeButtonClick).click();
        return this;
    }
}
