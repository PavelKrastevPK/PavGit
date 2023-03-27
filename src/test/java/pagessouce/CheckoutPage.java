package pagessouce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;
    @FindBy(id="checkout")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id="last-name")
    private WebElement lastName;
    @FindBy(id="postal-code")
    private WebElement postCode;
    @FindBy(id="continue")
    private WebElement continueDetailsPage;
    @FindBy(id="finish")
    private WebElement finish;
    @FindBy(id="checkout_complete_container")
    private WebElement purchaseMade;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkoutProcedure(){
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
    // Todo is displayed is not working
    public boolean completedPurchase(){
        if (purchaseMade.isDisplayed()){
            return true;
        }else {
            System.out.println("There is a problem with your purchase");
            return false;
        }
    }
}
