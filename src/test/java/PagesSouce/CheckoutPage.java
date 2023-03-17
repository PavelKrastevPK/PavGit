package PagesSouce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;
    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath= "//*[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id='postal-code']")
    private WebElement postCode;
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueDetailsPage;
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement finish;
    @FindBy(xpath = "//*[@id='checkout_complete_container']")
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
    public boolean completedPurchase(){
        if (purchaseMade.isDisplayed()){
            return true;
        }else {
            System.out.println("There is a problem with your purchase");
            return false;
        }
    }
}
