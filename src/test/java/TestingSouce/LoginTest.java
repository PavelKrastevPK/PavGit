package TestingSouce;

import Base.TestUtil;
import PagesSouce.LoginPage;
import PagesSouce.ProductPage;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CsvLogic;

import java.io.IOException;

public class LoginTest extends TestUtil {

    @Test (dataProvider = "csvUserList")
    public void SuccessfulLogin(String username,String password) {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username,password);
        productPage.logOut();

    }
}
