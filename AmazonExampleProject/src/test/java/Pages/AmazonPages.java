package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By searchBar = By.id("twotabsearchtextbox");

    static By searchButton = By.id("nav-search-submit-button");
    static By amazonBox = By.xpath("//span[contains(text(),'Amazon tarafından gönderilir')]");
    static By appleFilterBox = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static By firstProduct = By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By addToCart = By.id("add-to-cart-button");
    static By cart = By.id("nav-cart-count-container");
    static By check = By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearchBar() {
        elementHelper.click(searchBar);
    }

    public static void typeProduct() {
        elementHelper.sendKey(searchBar,"airpods");
    }

    public static void clickSearchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonBox);
    }

    public static void filterApple() {
        elementHelper.click(appleFilterBox);
    }

    public static void clickFirstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void clickAddCart() {
        elementHelper.click(addToCart);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
