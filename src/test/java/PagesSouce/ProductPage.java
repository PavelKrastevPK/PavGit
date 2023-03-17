package PagesSouce;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    protected WebDriver driver;
    @FindBy(xpath = "//*[text()='Open Menu']")
    private WebElement menuBar;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logOutButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCardLink;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartContainer;


    private static final String ADD_TO_CARD_LOCATOR = "//button[@id='add-to-cart-sauce-labs-%s']";

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logOut() {
        if (menuBar.isDisplayed()) {
            menuBar.click();
            logOutButton.click();
        } else {
            System.out.println("Menu bar is not displayed");
        }
    }

    public void addItemsToTheCart(String... products) {
        for (String productName : products) {

            String xpathOfTheElementToBeAdded = String.format(ADD_TO_CARD_LOCATOR, productName);
            WebElement addToCardButton = driver.findElement(By.xpath(xpathOfTheElementToBeAdded));
            addToCardButton.click();
        }
    }

    public int getItemsInTheBasket() {
        try {
            return Integer.parseInt(shoppingCartContainer.getText());
        } catch (NoSuchElementException e) {
            System.out.println("shopping card is empty");
            return 0;
        }

    }

    public CheckoutPage checkout() {
        shoppingCardLink.click();
        return new CheckoutPage(driver);
    }
}
