package pages;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class EmployeeHoursAggregationPage extends BasePage {

        public EmployeeHoursAggregationPage(WebDriver driver) {
            super(driver);
        }

        // Locators

        private By dashboardMenu =
                By.xpath("//span[normalize-space()='Dashboard']");

        private By projectSearch =
                By.xpath("//input[@placeholder='Search By Project']");

        private By selectProject =
                By.xpath("//div[normalize-space()='Mahindra']");

        private By employeeSearch =
                By.xpath("//input[@placeholder='Search By Employee']");

        private By startDate =
                By.xpath("//label[normalize-space()='Start Date']/following-sibling::input[@type='date']");

        private By periodDropdown =
                By.xpath("//div[@class=' items-end ']/select");

        private By endDate =
                By.xpath("//label[normalize-space()='End Date']/following-sibling::input[@type='date']");



        // Methods

        public void navigateToDashboard() {
            click(dashboardMenu);
        }

        public void searchProject(String projectName) {
            type(projectSearch, projectName);
            click(selectProject);
        }

        public void openProject() {
            // If project opens automatically after clicking search result,
            // this method can remain empty or include additional actions.
        }

        public void searchEmployee(String employeeName) {
            type(employeeSearch, employeeName);
            //click(selectProject);
        }

        public void selectStartDate(String date) {
            type(startDate, date);
        }

        public void selectPeriod(String period) {
            click(periodDropdown);
            click(By.xpath("//option[text()='" + period + "']"));
        }


        public void verifyAggregatedHours(String employeeName) {
            By totalHours = By.xpath("//tr[td[normalize-space()='"+ employeeName +"']]/td[2]");
            if (!isElementDisplayed(totalHours)) {
                throw new AssertionError("Total Hours are not displayed.");
            }
             String Total_Hours=getText(totalHours);
             System.out.println("Total Hours : " + Total_Hours);
                System.out.println("Parameter received: [" + employeeName + "]");

        }


        public void verifyEndDate(String expectedEndDate) {

            String actualEndDate = driver.findElement(endDate)
                    .getAttribute("value");

          // Assert.assertEquals(actualEndDate, expectedEndDate, "End Date is incorrect.");
        }
}

