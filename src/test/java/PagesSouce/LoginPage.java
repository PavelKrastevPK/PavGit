package PagesSouce;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    protected WebDriver driver;
    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[text()='Epic sadface: Password is required']")
    private WebElement passwordMissingError;
    @FindBy(xpath = "//*[text()='Epic sadface: Username is required']")
    private WebElement usernameMissingError;
    @FindBy(xpath = "//*[text()='Epic sadface: Username and password do not match any user in this service']")
    private WebElement incorrectDetailsError;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public ProductPage login (String username,String password){
        userNameInput.click();
        userNameInput.sendKeys(username);

        passwordInput.click();
        passwordInput.sendKeys(password);

        loginButton.click();
        return new ProductPage(driver);
    }
}
