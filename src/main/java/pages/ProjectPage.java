package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends BasePage {

        WebDriver driver;

        public ProjectPage(WebDriver driver) {
             super(driver);
            this.driver = driver;
        }

        // Locators

        private By projectMenu = By.xpath("//span[normalize-space()='Projects']/parent::a");

        private By actionButton = By.xpath("//button[@type='button' and normalize-space()='Actions']");

        private By manageMembers =
                By.xpath("//div[normalize-space()='Manage Members']");

        private By searchUser =
                By.xpath("//input[@placeholder='Search members...']");

        private By employeeCheckbox =
                By.xpath("//input[@type='checkbox']");

        private By updateMembersButton =
                By.xpath("//button[text()='Update Members']");

        /*private By successMessage =
                By.xpath("//div[contains(text(),'updated successfully')]");*/

        // Methods

        public void navigateToProjectPage() {
            click(projectMenu);
        }

        public void clickActionButton() {
            click(actionButton);
        }

        public void clickManageMembers(String option) {
            click(manageMembers);
        }

        public void searchEmployee() {
            type(searchUser, "swati Yashwant singanjude");
        }

        public void deselectEmployee() {

            if (driver.findElement(employeeCheckbox).isSelected()) {
                click(employeeCheckbox);
            }
            else{
                System.out.println("Employee checkbox is already deselected.");
            }

        }

        public void clickUpdateMembersButton() {
            click(updateMembersButton);
        }
       /* public void verifyEmployeeRemoved() {
            verifyElementVisible(successMessage);
        }
*/

}
