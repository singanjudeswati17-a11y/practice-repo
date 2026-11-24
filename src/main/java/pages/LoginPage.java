package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    // Locators

    private By continueWithMicrosoft =
            By.xpath("//span[contains(text(),'Continue with Microsoft')]");

    private By selectAccount=
            By.xpath("//div[contains(text(),'swati.s')]");

    private By emailTextbox =
            By.id("i0116");

    private By nextButton =
            By.id("idSIButton9");

    private By passwordTextbox =
            By.id("i0118");

    private By signInButton =
            By.id("idSIButton9");

    private By yesButton=
            By.id("idSIButton9");
    // Change this locator according to your application
    private By homePageLogo =
            By.xpath("//img[@alt='Kaara Logo']");

    public void launchApplication() {

        driver.get("http://localhost:3000/login");

    }
    //==================== Login Required? ====================//

    public boolean isLoginRequired() {

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Current URL : " + currentUrl);

        return currentUrl.contains("login.microsoftonline.com");

    }

    public void clickContinueWithMicrosoft() {

        wait.until(ExpectedConditions.elementToBeClickable(continueWithMicrosoft))
                .click();
    }
    //==================== Complete Login ====================//

    public void loginIfRequired(String emailId, String pwd) {

        if (isLoginRequired()) {

            System.out.println("Login Required...");

            clickContinueWithMicrosoft();

            if (isAccountDisplayed()) {
                selectAccount();
            }
            else {
                enterEmail(emailId);
                clickNext();
            }

            enterPassword(pwd);

            clickSignIn();

            clickYesIfDisplayed();

        } else {

            System.out.println("Already Logged In.");

        }
    }


        // Methods*/


    public boolean isAccountDisplayed() {

        return driver.findElements(selectAccount).size() > 0;

    }
    public void selectAccount() {

        wait.until(ExpectedConditions.elementToBeClickable(selectAccount))
                .click();
    }


    public void enterEmail(String email) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextbox))
                .sendKeys("swati.s@kaaratech.com");
    }

    public void clickNext() {

        wait.until(ExpectedConditions.elementToBeClickable(nextButton))
                .click();
    }

    public void enterPassword(String password) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextbox))
                .sendKeys("Swati#11552");
    }

    public void clickSignIn() {

        wait.until(ExpectedConditions.elementToBeClickable(signInButton))
                .click();
       //Thread.sleep(5000);
    }

    public void selectToLogin() {

        wait.until(ExpectedConditions.elementToBeClickable(yesButton))
                .click();
    }

    public void clickYesIfDisplayed() {

        if (driver.findElements(yesButton).size() > 0) {

            wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();

        }
    }
    public boolean isHomePageDisplayed() {

        WebElement logo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(homePageLogo));

        return logo.isDisplayed();
    }

}