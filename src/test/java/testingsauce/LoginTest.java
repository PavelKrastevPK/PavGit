package testingsauce;

import base.TestUtil;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.annotations.Test;

public class LoginTest extends TestUtil {

    @Test(dataProvider = "csvUserList")
    public void SuccessfulLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);
        productPage.logOut();
    }
}


