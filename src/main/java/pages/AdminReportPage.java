package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminReportPage extends BasePage {

    WebDriver driver;

    public AdminReportPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Search
    private By gotoAdminReport =
            By.xpath( "//span[text()='Admin Reports']");
    private By txtProjectName =
            By.xpath("//input[@placeholder='Search by Project Name']");

    // Dates
    private By txtStartDate =
            By.xpath("//input[@placeholder='Start Date']");

    private By txtEndDate =
            By.xpath("//input[@placeholder='End Date']");

    // Buttons
    private By btnDownloadCompleteReport =
            By.xpath("//button[contains(text(),'Download Complete Report')]");

    private By btnDownloadCompleteWeeklyReport =
            By.xpath("//button[contains(text(),'Download Complete Weekly Report')]");

    // Dynamic Buttons

    private By downloadReportButton(String projectName) {

        return By.xpath("//td[contains(text(),'" + projectName
                + "')]/following-sibling::td//button[contains(text(),'Download Report')]");
    }

    private By downloadWeeklyButton(String projectName) {

        return By.xpath("//td[contains(text(),'" + projectName
                + "')]/following-sibling::td//button[contains(text(),'Download Weekly Report')]");
    }

    // Actions
    public void navigateToAdminReport() {

        click(gotoAdminReport);
    }


    public void searchProject(String projectName) {

        enterText(txtProjectName, projectName);
    }

    public void enterStartDate(String date) {

        clearAndEnter(txtStartDate, date);
    }

    public void enterEndDate(String date) {

        clearAndEnter(txtEndDate, date);
    }

    public void clickCompleteReport() {

        click(btnDownloadCompleteReport);
    }

    public void clickCompleteWeeklyReport() {

        click(btnDownloadCompleteWeeklyReport);
    }

    public void clickProjectReport(String projectName) {

        click(downloadReportButton(projectName));
    }

    public void clickProjectWeeklyReport(String projectName) {

        click(downloadWeeklyButton(projectName));
    }

}