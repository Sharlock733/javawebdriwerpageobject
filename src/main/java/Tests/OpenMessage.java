package Tests;

import Pages.HomePage;
import Pages.AuthorizationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenMessage {

    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mapsme-locals-qa.ltst.su:9443/ru/");//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();
        home.clickOnInboxButton();
        if (!driver.findElements(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/a[1]")).isEmpty()) {
            System.out.println("Инбокс упешно открывается!");
        } else {
            System.out.println("Инбокс не открывается!");
        }
    }
}
