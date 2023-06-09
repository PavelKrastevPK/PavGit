package pagessouce;
import base.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private WebDriver driver;
    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id="password")
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
    public void unsuccessfulLogin(){
        TestUtil testUtil = new TestUtil();
        testUtil.explicitWait(incorrectDetailsError,driver,8);
    }
}
