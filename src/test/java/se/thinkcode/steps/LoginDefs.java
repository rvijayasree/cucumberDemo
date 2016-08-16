package se.thinkcode.steps;

import com.sainsburys.page_object.CatePage;
import com.sainsburys.page_object.topNavigationBarPage;
import com.sainsburys.page_object.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Asus on 15/08/2016.
 */
public class LoginDefs {
    LoginPage loginPage;
    topNavigationBarPage topNavigationBarPage;
    CatePage catePage;

    public LoginDefs(CatePage diCatePage,LoginPage diLoginPage,topNavigationBarPage diTopNavigationBarPage) {
        this.loginPage=diLoginPage;
        this.topNavigationBarPage=diTopNavigationBarPage;
        this.catePage=diCatePage;
    }

    @Given("^I navigate to login page$")
    public void i_am_on_login_page() {
        topNavigationBarPage.goToLoginPage();
    }

    @When("^I fill \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_fill_and(String email, String password) {
        loginPage.doLogin(email, password);
    }

    @When("^I click login$")
    public void i_click_login() {
        loginPage.clickOnLogin();
    }

    @Then("^I should be succesfully login$")
    public void i_should_be_succesfully_login() {
        Assert.assertTrue(topNavigationBarPage.isLogoutDisplayed());
    }

    @Then("^I see \"([^\"]*)\" on right top corner$")
    public void i_see_on_right_top_corner(String usersFullName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(topNavigationBarPage.isUserNameDisplayed(usersFullName));
    }
}
