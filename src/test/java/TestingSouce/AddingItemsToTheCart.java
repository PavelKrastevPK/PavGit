package TestingSouce;

import Base.TestUtil;
import PagesSouce.LoginPage;
import PagesSouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingItemsToTheCart extends TestUtil {
    @Test
    public void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");
        productPage.addItemsToTheCart("bike-light","backpack" );
        Assert.assertEquals(productPage.getItemsInTheBasket(), 2,"There are less than two items added: ");
        productPage.logOut();
    }
}

