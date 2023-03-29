package testingsauce;

import base.TestUtil;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingItemsToTheCart extends TestUtil {
    @Test
    private void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");
        productPage.addItemsToTheCart("bike-light","backpack" );
        Assert.assertEquals(productPage.getItemsInTheBasket(), 2,"There are less " +
                "than two items added: ");
        productPage.logOut();
    }
}

