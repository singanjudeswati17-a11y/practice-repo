package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewProjectPage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public NewProjectPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    // navigate to create Project
    private By goToProject = By.xpath("//span[text()='Project Details']");
    private By createNewProject = By.xpath("//button[text()='+ New Project']");

    // Project Information
    private By txtProjectName = By.xpath("//label[normalize-space()='Project Name']/following-sibling::input");
    private By txtInternalProjectName = By.xpath("//label[contains(normalize-space(),'Internal Project Name')]/following-sibling::input");
    private By txtDescription = By.xpath("//label[normalize-space()='High-Level Description']/following-sibling::textarea");
    private By txtTechnology = By.xpath("//label[contains(normalize-space(),'Core Technologies Used')]/following-sibling::input");

    // ==============================
    // Project Manager
    // ==============================

    private By txtManagerName = By.xpath("//label[normalize-space(text())='Name']/following-sibling::input");
    private By txtManagerEmail = By.xpath("//label[normalize-space(text())='Email']/following-sibling::input");
    private By txtManagerMobile = By.xpath("//label[normalize-space()='Mobile (Optional)']/following-sibling::input");

    // ==============================
    // Lead / Acting PM
    // ==============================

    private By txtLeadName = By.xpath("//p[normalize-space()='Lead / Acting PM']/ancestor::div[contains(@class,'border-t')]//label[normalize-space()='Name (Optional)']/following-sibling::input");
    private By txtLeadEmail = By.xpath("//p[normalize-space()='Lead / Acting PM']/ancestor::div[contains(@class,'border-t')]//label[normalize-space()='Email (Optional)']/following-sibling::input");
    private By txtLeadMobile = By.xpath("//p[normalize-space()='Lead / Acting PM']/ancestor::div[contains(@class,'border-t')]//label[normalize-space()='Mobile (Optional)']/following-sibling::input");

    // ==============================
    // Resource Information
    // ==============================

    private By txtMsEmail = By.xpath("//p[normalize-space()='Resource Information']/ancestor::div[contains(@class,'rounded-xl')]//label[contains(normalize-space(),'MS Email ID')]/following-sibling::input");
    private By txtLocation = By.xpath("//p[normalize-space()='Resource Information']/ancestor::div[contains(@class,'rounded-xl')]//label[normalize-space()='Current Location (City)']/following-sibling::input");
    private By txtEmergencyContact = By.xpath("//input[@placeholder='86XXXXXXXX - Relation (Name)']");

    // ==============================
    // Dates
    // ==============================

    private By txtStartDate = By.xpath("//label[contains(normalize-space(),'Start Date')]/following-sibling::input[@type='date']");
    private By txtEndDate = By.xpath("//label[normalize-space()='End Date']/following-sibling::input[@type='date']");

    // ==============================
    // Buttons
    // ==============================

    private By btnSave = By.xpath("//button[text()='Save']");
    private By btnCancel = By.xpath("//button[text()='Cancel']");
    // ==============================
    // Methods
    // ==============================

    public void navigateToProject() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToProject)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(createNewProject)).click();
    }

    public void enterProjectName(String projectName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtProjectName));
    }

    public void enterInternalProjectName(String internalName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtInternalProjectName)).sendKeys("CLT-Microsoft");
    }

    public void enterDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtDescription)).sendKeys("Created for testing");
    }

    public void enterTechnology(String technology) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtTechnology)).sendKeys("Selenium");
    }

    public void enterProjectManager(String name, String email, String mobile) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtManagerName)).sendKeys("Shashi");

        driver.findElement(txtManagerEmail).sendKeys("dishroa@kaara.com");

        driver.findElement(txtManagerMobile).sendKeys("6549267321");
    }

    public void enterLead(String name, String email, String mobile) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtLeadName)).sendKeys("Dikshant");

        driver.findElement(txtLeadEmail).sendKeys("dikshantsharma@kaara.com");

        driver.findElement(txtLeadMobile).sendKeys("8999267337");
    }

    public void enterResourceInformation(String msEmail,
                                         String location,
                                         String emergencyContact) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtMsEmail)).sendKeys("Sunilh@microsoft.com");

        driver.findElement(txtLocation).sendKeys("Mumbai");

        driver.findElement(txtEmergencyContact).sendKeys("9899267346");
    }

    public void enterProjectDuration(String startDate,
                                     String endDate) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtStartDate)).sendKeys("01-01-2026");

        driver.findElement(txtEndDate).sendKeys("10-10-2026");
    }

    public void clickSave()throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(btnSave)).click();
        Thread.sleep(3000);
    }

    public void clickCancel()throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(btnCancel)).click();
        Thread.sleep(3000);
    }

    public boolean isProjectSaved() {

        return driver.getPageSource().contains("Success")
                || driver.getPageSource().contains("Created")
                || driver.getPageSource().contains("Saved");
    }

}