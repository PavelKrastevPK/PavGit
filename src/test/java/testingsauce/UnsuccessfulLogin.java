package testingsauce;

import base.TestUtil;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.annotations.Test;

public class UnsuccessfulLogin extends TestUtil {
    @Test
    private void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "wrong");
loginPage.unsuccessfulLogin();
    }
}

