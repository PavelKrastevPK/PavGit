package TestingSouce;

import Base.TestUtil;
import PagesSouce.CheckoutPage;
import PagesSouce.LoginPage;
import PagesSouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends TestUtil {
    @Test(dataProvider = "csvUserList")
    public void checkout() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");
        productPage.addItemsToTheCart("bike-light","backpack" );
        Assert.assertEquals(productPage.getItemsInTheBasket(), 3,"There are less than" +
                " three items added to the cart: ");
        productPage.checkout();
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.checkoutProcedure();

    }
}
