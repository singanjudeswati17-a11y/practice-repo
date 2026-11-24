package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

        protected WebDriver driver;
        protected WebDriverWait wait;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        // Click Element
        protected void click(By locator) {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        }

        // Enter Text
        protected void type(By locator, String text) {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
            element.sendKeys(text);
        }
       public void enterText(By locator, String text) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .sendKeys(text);
       }

       public void clearAndEnter(By locator, String text) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .clear();

        driver.findElement(locator).sendKeys(text);
       }

        // Get Text
        protected String getText(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        }

        // Verify Element Visible
        protected boolean isElementDisplayed(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        }

        // Wait for Element
        protected WebElement waitForElement(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        // Wait for Clickable
        protected WebElement waitForClickable(By locator) {
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        }

        // Check Checkbox Status
        protected boolean isSelected(By locator) {
            return driver.findElement(locator).isSelected();
        }

        // Scroll Into View
        protected void scrollToElement(By locator) {
            WebElement element = waitForElement(locator);

            ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", element);
        }

}
