package jalatechnologies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JalaLoginPage {
    @FindBy(id="UserName")
    private WebElement userNameInput;
    @FindBy(id="Password")
    private WebElement passwordInput;
    @FindBy(id="btnLogin")
    private WebElement loginButton;

    protected WebDriver driver;
    public JalaLoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public JalaHomePage loginto (String username, String password){
        userNameInput.click();
        userNameInput.sendKeys(username);

        passwordInput.click();
        passwordInput.sendKeys(password);

        loginButton.click();

        return new JalaHomePage(driver);
    }
}
