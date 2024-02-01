package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("User clicks accept cookies")
    public void userClicksAcceptCookies() {
        AmazonPages.acceptCookie();
    }

    @When("User click search bar")
    public void userClickSearchBar() {
        AmazonPages.clickSearchBar();
    }

    @When("User types the product name")
    public void userTypesTheProductName() {
        AmazonPages.typeProduct();
    }

    @When("User clicks search button")
    public void userClicksSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("User filters Shipped by Amazon")
    public void userFiltersShippedByAmazon() {
        AmazonPages.filterAmazon();
    }

    @When("User filters for Apple")
    public void userFiltersForApple() {
        AmazonPages.filterApple();
    }

    @When("User clikcs the first product")
    public void userClikcsTheFirstProduct() {
        AmazonPages.clickFirstProduct();
    }

    @When("User adds product to Cart")
    public void userAddsProductToCart() {
        AmazonPages.clickAddCart();
    }

    @When("User checks product is at Cart page")
    public void userChecksProductIsAtCartPage() {
        AmazonPages.checkCart();
    }
}
