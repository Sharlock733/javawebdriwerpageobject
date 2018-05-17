package tests;

import mapsmepages.AuthorizationPage;
import mapsmepages.HomePage;
import mapsmepages.InboxPage;
import mapsmepages.TripPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.AlexeyProfilePage.GECODR;
import static mapsmepages.AlexeyProfilePage.GECODRPATH;
import static mapsmepages.HomePage.URLMAPSME;

public class СheckAvailabilityOfVisitors {
    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty(GECODR, GECODRPATH);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);
        TripPage trip = new TripPage(driver);
        InboxPage inbox = new InboxPage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Авторизация

        home.clickOnInboxButton();//переход в инбокс
        inbox.clickOnViseters();//переход на станицу визитеров

        if (!driver.findElements(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div")).isEmpty()) {
            System.out.println("Визитеры есть на странице");
        } else {
            System.out.println("Визитеров нет на странице");
        }
        driver.close();

    }
}
