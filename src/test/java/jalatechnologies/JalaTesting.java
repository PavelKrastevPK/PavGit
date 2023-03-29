package jalatechnologies;

import base.TestUtilJala;
import org.testng.annotations.Test;

public class JalaTesting extends TestUtilJala {
    @Test
    private void SuccessfulLogin() {
        JalaLoginPage loginPage = new JalaLoginPage(driver);
        JalaHomePage homePage = loginPage.loginto("training@jalaacademy.com","jobprogram");
        homePage.logOut();
    }
    @Test
    private void SearchForPerson(){
        JalaLoginPage loginPage = new JalaLoginPage(driver);
        JalaHomePage homePage = loginPage.loginto("training@jalaacademy.com","jobprogram");
        homePage.searchForEmployee();
        homePage.logOut();
    }
}
