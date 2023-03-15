package PagesSouce;

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

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void logOut() {
        if (menuBar.isDisplayed()) {
            menuBar.click();
            logOutButton.click();
        } else {
            System.out.println("Menu bar is not displayed");
        }
    }
}
