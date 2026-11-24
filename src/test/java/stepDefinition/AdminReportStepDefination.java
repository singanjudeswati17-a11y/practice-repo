package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminReportPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminReportStepDefination {

    AdminReportPage adminReport = new AdminReportPage(DriverFactory.getDriver());

    @Given("User is on Admin Report page")
    public void user_is_on_admin_report_page() {

        adminReport.navigateToAdminReport();
    }

    @When("User searches for project {string}")
    public void user_searches_for_project(String projectName) {

        adminReport.searchProject(projectName);
    }

    @And("User selects report date range")
    public void user_selects_report_date_range() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String startDate = LocalDate.now().minusDays(30).format(formatter);

        String endDate = LocalDate.now().format(formatter);

        adminReport.enterStartDate(startDate);
        adminReport.enterEndDate(endDate);
    }

    @And("User clicks Download Complete Report")
    public void user_clicks_download_complete_report() {

        adminReport.clickCompleteReport();
    }

    @And("User clicks Download Complete Weekly Report")
    public void user_clicks_download_complete_weekly_report() {

        adminReport.clickCompleteWeeklyReport();
    }

    @And("User clicks Project Download Report")
    public void user_clicks_project_download_report() {

        adminReport.clickProjectReport("Mahindra");
    }

    @And("User clicks Project Weekly Report")
    public void user_clicks_project_weekly_report() {

        adminReport.clickProjectWeeklyReport("Mahindra");
    }

    @Then("Report should be downloaded successfully")
    public void report_should_be_downloaded_successfully() {

        System.out.println("Verify report downloaded successfully.");
    }
}