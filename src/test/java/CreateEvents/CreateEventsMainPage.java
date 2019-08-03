package CreateEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CreateEventsMainPage {
    WebDriver driver;

    public CreateEventsMainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By createEventButton = By.id("idbtnaddevent");
    private By eventTitleField = By.id("idfieldtitleevent");
    private By descriptionField = By.id("iddescriptionevent");
    private By dateField = By.id("idfielddateevent");
    private By timeField = By.id("idfieldtimeevent");
    private By durationField = By.id("idfielddurationevent");
    private By cityField = By.id("idfieldcityevent");
    private By streetField = By.id("idfieldstreetevent");
    private By builderField = By.id("idfieldbuilderevent");
    private By placesField = By.id("idfieldplaces");
    private By holidaySelect = By.xpath("//*[@id='idholidayevent']//select");
    private By confessionSelect = By.xpath("//*[@id='idconfessionevent']//select");
    private By languageSelect = By.xpath("//*[@id='idlanguagesevent']//select");
    private By foodSelect = By.xpath("//*[@id='idfoodevent']//select");
    private By saveEventButtonClick = By.id("saveeditevent");
    private By myEventTest = By.id("idtitleevent");
    private By statusTest = By.id("contentmessageschat");

    public CreateEventsMainPage scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        return this;
    }

    public CreateEventsMainPage createEvents() {
        driver.findElement(createEventButton).click();
        return this;
    }

    public CreateEventsMainPage eventTitle(String titleName) {
        driver.findElement(eventTitleField).click();
        driver.findElement(eventTitleField).clear();
        driver.findElement(eventTitleField).sendKeys(titleName);
        return this;
    }

    public CreateEventsMainPage description(String des) {
        driver.findElement(descriptionField).click();
        driver.findElement(descriptionField).clear();
        driver.findElement(descriptionField).sendKeys(des);
        return this;
    }

    public CreateEventsMainPage date() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        driver.findElement(dateField).click();
        driver.findElement(dateField).sendKeys("2019");
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(2000);

        driver.findElement(dateField).sendKeys("08");
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(2000);

        driver.findElement(dateField).sendKeys("25");
        Thread.sleep(2000);
        return this;
    }

    public CreateEventsMainPage time(String time) {
        driver.findElement(timeField).click();
        driver.findElement(timeField).sendKeys(time);
        return this;
    }

    public CreateEventsMainPage duration(String duration) {
        driver.findElement(durationField).click();
        driver.findElement(durationField).clear();
        driver.findElement(durationField).sendKeys(duration);
        return this;
    }

    public CreateEventsMainPage city(String city) {
        driver.findElement(cityField).click();
        driver.findElement(cityField).sendKeys(city);
        return this;
    }

    public CreateEventsMainPage street(String street) {
        driver.findElement(streetField).click();
        driver.findElement(streetField).sendKeys(street);
        return this;
    }

    public CreateEventsMainPage builder(String builder) {
        driver.findElement(builderField).click();
        driver.findElement(builderField).sendKeys(builder);
        return this;
    }

    public CreateEventsMainPage places(String places) {
        driver.findElement(placesField).click();
        driver.findElement(placesField).clear();
        driver.findElement(placesField).sendKeys(places);
        return this;
    }

    public CreateEventsMainPage holiday() {
        Select select = new Select(driver.findElement(holidaySelect));
        select.selectByValue("Purim");
        return this;
    }

    public CreateEventsMainPage confession() {
        Select select = new Select(driver.findElement(confessionSelect));
        select.selectByValue("Religious");
        return this;
    }

    public CreateEventsMainPage language() {
        Select select = new Select(driver.findElement(languageSelect));
        select.selectByValue("Russian");
        return this;
    }

    public CreateEventsMainPage food() {
        Select select = new Select(driver.findElement(foodSelect));
        select.selectByValue("Kosher");
        return this;
    }

    public CreateEventsMainPage saveEventButton() {
        driver.findElement(saveEventButtonClick).click();
        return this;
    }

    public String myEvent() {
        String eventTest = driver.findElement(myEventTest).getText();
        return eventTest;
    }

    public String eventStatus() {
        String evStat = driver.findElement(statusTest).getText();
        return evStat;
    }
}
