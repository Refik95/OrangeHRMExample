package StepDefinitions;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at login page")
    public void userAtLoginPage() {
        loginPage.verifyUserAtLoginPage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check Required message about Username and Password")
    public void checkRequiredMessageAboutUsernameAndPassword() {
        loginPage.checkRequiredMessage();
    }

    @When("Type Username and Password")
    public void typeUsernameAndPassword() {
        loginPage.typeUsernameandPassword();
    }

    @Then("Check Invalid credentials message about login")
    public void checkInvalidCredentialsMessageAboutLogin() {
        loginPage.checkInvalidCredentialsMessage();
    }

    @When("Type True Username and Password")
    public void typeTrueUsernameAndPassword() {
        loginPage.typeTrueUsernameandPassword();
    }

    @Then("Check Successfull Login")
    public void checkSuccessfullLogin() {
        loginPage.checkDashboardText();
    }
}
