package StepDefinitions;

import Pages.DashboardPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DashBoardPageStepDefinitons {

    WebDriver driver = DriverFactory.getDriver();
    DashboardPage dashboardPage= new DashboardPage(driver);

    @When("Click to My Info Button")
    public void clickToMyInfoButton() {
        dashboardPage.clikToMyInfo();
    }

    @When("Change First Name, Middle Name and Last Name")
    public void changeFirstNameMiddleNameAndLastName() {
        dashboardPage.changeFirstNameMiddleNameAndLastName();
    }

    @When("Click to Save Button")
    public void clickToSaveButton() {
        dashboardPage.clickToSaveButton();
    }

    @Then("Check New Name, Middle Name and Last Name")
    public void checkNewNameMiddleNameAndLastName() {
        dashboardPage.checkNewNameMiddleNameAndLastName();
    }

}
