package jalatechnologies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JalaHomePage {
    @FindBy(xpath = "//*[text()='Logout']")
    private WebElement logOutButton;
    @FindBy(xpath = "//*[@id='MenusDashboard']/li[2]")
    private WebElement menuBarEmployees;
    @FindBy(xpath = "//*[@id='MenusDashboard']/li[2]/ul/li[2]/a")
    private WebElement menuBarSearch;
    @FindBy(id = "Name")
    private WebElement employeeNameBar;
    @FindBy(id = "btnSearch")
    private WebElement employeeSearchBtn;
    @FindBy(xpath = "//*[@id='tblEmployee']/tbody/tr/td")
    private WebElement noSuchRecord;

    protected WebDriver driver;

    protected JalaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void logOut() {
        if (logOutButton.isDisplayed()) {
            logOutButton.click();
        } else {
            System.out.println("Logout button is not displayed");
        }
    }

    protected void searchForEmployee() {
        menuBarEmployees.click();
        menuBarSearch.click();
        employeeNameBar.click();
        employeeNameBar.sendKeys("Sowmya");
        employeeSearchBtn.click();
        noSuchRecords();
    }

    private boolean noSuchRecords() {
        if (noSuchRecord.isDisplayed()) {
            return true;
        } else {
            System.out.println("The employee you're looking for does not exist in our records");
            return false;
        }
    }
}
