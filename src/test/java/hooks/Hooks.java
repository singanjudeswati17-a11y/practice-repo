package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LoginPage;

public class Hooks {

    @Before
    public void setup() {

        // initialize driver
        DriverFactory.getDriver();

        // ensure application is opened and user is logged in for scenarios that don't explicitly launch the app
        // if your app URL or credentials are different, update them here or move to a config file
        DriverFactory.getDriver().get("http://localhost:3000/login");

        // perform login if the application redirects to an external provider
        new LoginPage(DriverFactory.getDriver()).loginIfRequired(
                "testuser@gmail.com",
                "Password@123"
        );
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();
    }

}
