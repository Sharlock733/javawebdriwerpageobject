package tests;

import mapsmepages.HomePage;
import mapsmepages.AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.AlexeyProfilePage.GECKODRIVERNAME;
import static mapsmepages.AlexeyProfilePage.GECKODRIVERPATH;
import static mapsmepages.HomePage.URLMAPSME;

public class TestAuthorization {
    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty(GECKODRIVERNAME, GECKODRIVERPATH);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);


        home.clickOnCookiButton();
        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();
        driver.quit();
    }
}
