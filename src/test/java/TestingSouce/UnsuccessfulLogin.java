package TestingSouce;

import Base.TestUtil;
import PagesSouce.LoginPage;
import PagesSouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnsuccessfulLogin extends TestUtil {
    @Test
    public void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "wrong");

        productPage.logOut();
    }
}

