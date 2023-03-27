package testingsauce;

import base.TestUtil;
import pagessouce.CheckoutPage;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends TestUtil {
    @Test
    public void checkout() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");
        productPage.addItemsToTheCart("fleece-jacket","onesie","bolt-t-shirt" );
        Assert.assertEquals(productPage.getItemsInTheBasket(), 3,"There are less than" +
                " three items added to the cart: ");
        productPage.checkout();
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.checkoutProcedure();
        checkout.completedPurchase();
        productPage.logOut();
    }
}
