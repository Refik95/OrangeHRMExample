package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

public class DashboardPage {
    WebDriver driver;
    Utils.ElementHelper elementHelper;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new Utils.ElementHelper(driver);}

    By myInfoButton = By.xpath("//span[text()='My Info']");
    By saveButton = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[text()=' Save ']");
    By userNameAndSurnameTitle = By.xpath("//p[@class='oxd-userdropdown-name']");

    public void clikToMyInfo() {
        driver.findElement(myInfoButton).click();
    }

    public void changeFirstNameMiddleNameAndLastName() {
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys(Keys.CONTROL+"a");
        firstName.sendKeys(Keys.DELETE);
        firstName.sendKeys("Refik");

        WebElement middleName = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
        middleName.sendKeys(Keys.CONTROL+"a");
        middleName.sendKeys(Keys.DELETE);
        middleName.sendKeys("Erkan");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys(Keys.CONTROL+"a");
        lastName.sendKeys(Keys.DELETE);
        lastName.sendKeys("Gunhan");
    }

    public void clickToSaveButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        driver.findElement(saveButton).click();
    }

    public void checkNewNameMiddleNameAndLastName() {
        driver.findElement(myInfoButton).click();
        WebElement newUsernameAndSurname = driver.findElement(userNameAndSurnameTitle);
        String newUsernameAndSurnameText = newUsernameAndSurname.getText();
        assertEquals(newUsernameAndSurnameText,"Refik Gunhan");
    }
}
