package testingsauce;

import base.TestUtil;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.annotations.Test;

public class UnsuccessfulLogin extends TestUtil {
    @Test
    public void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "wrong");
        productPage.logOut();
    }
}

