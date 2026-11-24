package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.NewProjectPage;


public class NewProjectSteps {

    NewProjectPage newProjectPage = new NewProjectPage(DriverFactory.getDriver());

    @Given("User create new project page")
    public void user_create_new_project_page() {

        //navigate to the page here.
        newProjectPage.navigateToProject();

        System.out.println("User is on New Project page.");
    }

    @When("User fills new project details")
    public void user_fills_new_project_details() {

        newProjectPage.enterProjectName("Automation Project");

        newProjectPage.enterInternalProjectName("Automation_Internal");

        newProjectPage.enterDescription("This project is created using Selenium Automation.");

        newProjectPage.enterTechnology("Java, Selenium, TestNG");

        newProjectPage.enterProjectManager(
                "John Smith",
                "john@test.com",
                "9876543210");

        newProjectPage.enterLead(
                "David",
                "david@test.com",
                "9876543211");

        newProjectPage.enterResourceInformation(
                "automation@test.com",
                "Pune",
                "9876543212");

        newProjectPage.enterProjectDuration(
                "01-07-2026",
                "31-12-2026");
    }

    @When("User saves the project")
    public void user_saves_the_project() throws InterruptedException{

        newProjectPage.clickSave();
    }
    @When("User cancel the project")
    public void userCancelTheProject()throws InterruptedException {
        newProjectPage.clickCancel();
        throw new PendingException();
    }

    @Then("New project should be created successfully")
    public void new_project_should_be_created_successfully() {

        Assert.assertTrue(
                newProjectPage.isProjectSaved(),
                "Project was not created successfully.");
    }

    @Then("New project should not be created.")
    public void newProjectShouldNotBeCreated() {
        // Write code here that turns the phrase above into concrete actions

    }

}