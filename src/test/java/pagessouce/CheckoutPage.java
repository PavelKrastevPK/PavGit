package pagessouce;

import base.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postCode;
    @FindBy(id = "continue")
    private WebElement continueDetailsPage;
    @FindBy(id = "finish")
    private WebElement finish;
    @FindBy(id = "checkout_complete_container")
    private WebElement purchaseMade;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkoutProcedure() {
        checkoutButton.click();
        firstName.click();
        firstName.sendKeys("Pavel");
        lastName.click();
        lastName.sendKeys("Krastev");
        postCode.click();
        postCode.sendKeys("4230");
        continueDetailsPage.click();
        finish.click();

    }

    public void completedPurchase() {
        TestUtil testUtil = new TestUtil();
        testUtil.explicitWait(purchaseMade,driver,8);
    }
}
