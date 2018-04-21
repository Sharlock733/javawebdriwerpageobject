package tests;

import mapsmepages.HomePage;
import mapsmepages.AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.HomePage.URLMAPSME;

public class TestAuthorization {
    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();
        driver.quit();
    }
}
