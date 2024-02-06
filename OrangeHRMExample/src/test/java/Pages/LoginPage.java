package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {
    WebDriver driver;
    Utils.ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new Utils.ElementHelper(driver);}

    By LoginTitle = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    By LoginButton = By.xpath("//button[@type='submit']");

    By requiredMessageForUsername = By.xpath("//div[@class='orangehrm-login-form']//div[1]//div[1]//span[1]");

    By requiredMessageForPassword = By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]");

    By usernameField = By.xpath("//input[@placeholder='Username']");

    By passwordField = By.xpath("//input[@placeholder='Password']");
    By invalidCredentialsMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

    By dashboardTitle = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");


    public void verifyUserAtLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement title = driver.findElement(LoginTitle);
        String titleText = title.getText();
        assertEquals(titleText, "Login") ;
    }

    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }


    public void checkRequiredMessage() {
        elementHelper.checkVisible(requiredMessageForUsername);
        elementHelper.checkVisible(requiredMessageForPassword);
    }

    public void typeUsernameandPassword() {
        driver.findElement(usernameField).click();
        elementHelper.sendKey(usernameField,"abcd");
        driver.findElement(passwordField).click();
        elementHelper.sendKey(passwordField,"123123");
    }

    public void checkInvalidCredentialsMessage() {
        WebElement errorMessage = driver.findElement(invalidCredentialsMessage);
        String errorMessageText = errorMessage.getText();
        assertEquals(errorMessageText,"Invalid credentials");
    }

    public void typeTrueUsernameandPassword() {
        driver.findElement(usernameField).click();
        elementHelper.sendKey(usernameField,"Admin");
        driver.findElement(passwordField).click();
        elementHelper.sendKey(passwordField,"admin123");
    }

    public void checkDashboardText() {
        WebElement titleDashboardElement = driver.findElement(dashboardTitle);
        String titleDashboardElementText = titleDashboardElement.getText();
        assertEquals(titleDashboardElementText,"Dashboard");
    }
}
