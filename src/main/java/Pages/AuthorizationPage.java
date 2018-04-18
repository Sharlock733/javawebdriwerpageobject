package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage {

    public WebDriver driver;

    By mailLocator = By.name("email");
    By passwordLocator = By.name("pass");
    By loginButtonLocator = By.id("install_allow");

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName() {

        driver.findElement(mailLocator).sendKeys("qavkvirt@yandex.ru");
    }

    public void typePassword() {
        driver.findElement(passwordLocator).sendKeys("gRiboder27");
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }
    /*public LoginPage(WebDriver driver) {
        this.driver = driver;

        if (!"Login".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the login page");
        }
    }
    public LoginPage typeUsername(String username) {
        driver.findElement(mailLocator).sendKeys("qavkvirt@yandex.ru");
        return this;
    }
    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys("gRiboder27");
        return this;
    }
    public LoginPage ClickLoginButton (String password) {
        driver.findElement(loginButtonLocator).click();
        return this;
    }
*/
}
