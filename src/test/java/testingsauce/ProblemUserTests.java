package testingsauce;

import base.TestUtil;
import pagessouce.LoginPage;
import pagessouce.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProblemUserTests extends TestUtil {
    @Test
    private void newTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("problem_user", "secret_sauce");
        productPage.addItemsToTheCart("bolt-t-shirt");
        Assert.assertEquals(productPage.getItemsInTheBasket(), 1, "There is less " +
                "than one item added: ");
        productPage.logOut();
    }
    /*Problem user:
    Several bugs, above test is trying to add Bolt-t-Shirt and proves that it cannot be added
    You cant remove items unless you go into the shopping cart.
    You cannot enter your details as when you try to add last name it changes your username.
    There is one picture for every item.
    "About" button gives error 404

    Lockout user:
    Login message:
    Epic sadface: Sorry, this user has been locked out.

    Performance glitch user:
    Takes longer to login everything else seems to be normal

     */

}