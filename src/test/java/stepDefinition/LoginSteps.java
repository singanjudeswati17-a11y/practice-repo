package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
/*
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User launches application")
    public void user_launches_application() {

        DriverFactory.getDriver().get("http://localhost:3000/login");
    }

    @When("click on continue with microsoft")
    public void click_on_continue_with_microsoft() {

        loginPage.clickContinueWithMicrosoft();
    }

    @And("click on account")
    public void clickOnAccount() {
        // Write code here that turns the phrase above into concrete actions
      loginPage.selectAccount();
    }

   @When("enter email and click on next")
    public void enter_email_and_click_on_next() {

        loginPage.enterEmail("testuser@gmail.com");
        loginPage.clickNext();
    }

    @When("enter password and click in 'signIn'")
    public void enter_password_and_click_in_sign_in() throws InterruptedException {

        loginPage.enterPassword("Password@123");
        loginPage.clickSignIn();
    }
    @And("select yes to login")
    public void selectYesToLogin() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.selectToLogin();
    }

    @Then("User should login successful")
    public void user_should_login_successful() {

        Assert.assertTrue(loginPage.isHomePageDisplayed(),
                "Login Failed");
    }

}*/


        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

        @Given("User launches application")
        public void user_launches_application() {

            loginPage.launchApplication();

            loginPage.loginIfRequired(
                    "testuser@gmail.com",
                    "Password@123");

        }
      @And("click on continue with microsoft account")
       public void clickOnContinueWithMicrosoftAccount() {

            loginPage.clickContinueWithMicrosoft();
        }

        @Then("User should login successful")
        public void user_should_login_successful() {

            Assert.assertTrue(loginPage.isHomePageDisplayed());

        }


}