package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProjectPage;

public class RemoveEmployeeSteps {

    ProjectPage projectPage = new ProjectPage(DriverFactory.getDriver());

    @Given("User is on the Project page")
    public void user_is_on_the_project_page() {
        projectPage.navigateToProjectPage();
    }

    @When("User clicks on the Action menu for the project")
    public void user_clicks_on_the_action_menu_for_the_project() {
        projectPage.clickActionButton();
    }

    @When("User clicks on {string}")
    public void user_clicks_on_manage_members(String option) {
        projectPage.clickManageMembers(option);
    }

    @When("User searches for the employee username")
    public void user_searches_for_the_employee_username() {
        projectPage.searchEmployee();
    }

    @When("User deselects the employee checkbox")
    public void user_deselects_the_employee_checkbox() {
        projectPage.deselectEmployee();
    }

    @When("User clicks on the Update Members button")
    public void user_clicks_on_the_update_members_button() {
        projectPage.clickUpdateMembersButton();
    }

    @Then("Employee should be removed from the project successfully")
    public void employee_should_be_removed_from_the_project_successfully() {
        //projectPage.verifyEmployeeRemoved();
    }

}
