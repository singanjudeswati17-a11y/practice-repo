package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHoursAggregationPage;

public class EmployeeHoursAggregationSteps {

    EmployeeHoursAggregationPage employeePage =
                new EmployeeHoursAggregationPage(DriverFactory.getDriver());

        @Given("User is on the Dashboard page")
        public void user_is_on_dashboard_page() {
            employeePage.navigateToDashboard();
        }

        @When("User searches for the project {string}")
        public void user_searches_for_the_project(String projectName) {
            employeePage.searchProject(projectName);
        }

        @When("User opens the selected project")
        public void user_opens_the_selected_project() {
            employeePage.openProject();
        }

        @When("User searches for the employee {string}")
        public void user_searches_for_the_employee(String employeeName) {
            employeePage.searchEmployee(employeeName);
        }

        @When("User selects the start date {string}")
        public void user_selects_the_start_date(String startDate) {
            employeePage.selectStartDate(startDate);
        }

        @When("User selects {string} from the Period dropdown")
        public void user_selects_period(String period) {
            employeePage.selectPeriod(period);
        }

       @Then("Employee end date should be {string}")
       public void employee_end_date_should_be(String expectedEndDate) {
        employeePage.verifyEndDate(expectedEndDate);
        }

       @Then("Employee total hours should be aggregated according to the selected {string}")
        public void employee_total_hours_should_be_aggregated(String employeeName ) {
        employeePage.verifyAggregatedHours(employeeName);
        }

}
