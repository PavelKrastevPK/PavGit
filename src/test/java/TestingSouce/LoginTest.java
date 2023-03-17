package TestingSouce;

import Base.TestUtil;
import PagesSouce.LoginPage;
import PagesSouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestUtil {

    @Test(dataProvider = "csvUserList")
    public void SuccessfulLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);
        productPage.logOut();

    }

    @Test(dataProvider = "csvUserList")
    public void addingItemsToTheBasket(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);
        productPage.addItemsToTheCart("Onesie");
        System.out.println(productPage.getItemsInTheBasket());
    }

}


