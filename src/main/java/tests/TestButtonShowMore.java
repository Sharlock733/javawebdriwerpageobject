package tests;

import mapsmepages.AuthorizationPage;
import mapsmepages.HomePage;
import mapsmepages.InboxPage;
import mapsmepages.TripPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.AlexeyProfilePage.GECKODRIVERNAME;
import static mapsmepages.AlexeyProfilePage.GECKODRIVERPATH;
import static mapsmepages.HomePage.URLMAPSME;

public class TestButtonShowMore {
    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty(GECKODRIVERNAME, GECKODRIVERPATH);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);
        TripPage trip = new TripPage(driver);
        InboxPage inbox = new InboxPage(driver);


        home.clickOnCookiButton();
        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Авторизация

        home.clickOnButtonShowMore();

        Thread.sleep(5000);


        if (!driver.findElements(By.xpath("\n" + "/html/body/div/div[1]/main/div[2]/section[2]/div/div/div/div/div[18]/div/div")).isEmpty()) {
            System.out.println("Кнопка Show more работает!!!");
        } else {
            System.out.println("Кнопка Show more не работает");
        }//Проверка, работает ли выдача по нажатию кнопки Show more"

        driver.close();
    }
}
